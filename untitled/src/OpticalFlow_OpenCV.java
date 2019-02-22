import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.nio.Buffer;
import javax.crypto.Cipher;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;
import org.opencv.videoio.Videoio;

public class OpticalFlow_OpenCV extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private BufferedImage mImg;
	private static BufferedImage avg = null;
	private static double alpha = 0.07;
	
	//Mat -> BufferedImage
	private BufferedImage mat2BI(Mat mat) {
		int dataSize = mat.cols() * mat.rows() * (int)mat.elemSize();
		byte[] data = new byte[dataSize];
		mat.get(0, 0, data);
		int type = mat.channels() == 1 ? BufferedImage.TYPE_BYTE_GRAY: BufferedImage.TYPE_3BYTE_BGR;
		
		//if channels != 1, bgr to rgb, swap b<->r
		if(type == BufferedImage .TYPE_3BYTE_BGR) {
			for(int i = 0; i < dataSize; i+=3) {
				byte blue = data[i+0];
				data[i+0] = data[i+2];
				data[i+2] = blue;
			}
		}
		
		BufferedImage image = new BufferedImage(mat.cols(), mat.rows(), type);
		image.getRaster().setDataElements(0, 0, mat.cols(), mat.rows(), data);
		
		return image;
	}
	
	private static BufferedImage grayScale(BufferedImage bi) {
		for(int y = 0; y < bi.getHeight(); y++) {
			for(int x = 0; x < bi.getWidth(); x++) {
				int rgb = bi.getRGB(x, y);
				int r = (rgb >> 16) & 0xff;
				int g = (rgb >> 8) & 0xff;
				int b = rgb & 0xff;
				bi.setRGB(x, y, (r << 16)+(g << 8)+b/3);
			}
		}
		return bi;
	}
	
	//accumulate
	private static BufferedImage opticalFlow(BufferedImage bi) {
		bi = grayScale(bi);
		BufferedImage dst = new BufferedImage(bi.getWidth(), bi.getHeight(), bi.getType());
		
		if(avg == null) {
			avg  = bi;
			return null;
		}
		
//		Imgproc.accumulateWeighted(src, avg, 0.5);
//		Core.absdiff(src, avg, dst);
		for(int y = 0; y < bi.getHeight(); y++) {
			for(int x = 0; x < bi.getWidth(); x++) {
				int brgb = bi.getRGB(x, y);
				int br = (brgb >> 16) & 0xff;
				int bg = (brgb >> 8) & 0xff;
				int bb = brgb & 0xff;
				
				int argb = avg.getRGB(x, y);
				int ar = (argb >> 16) & 0xff;
				int ag = (argb >> 8) & 0xff;
				int ab = argb & 0xff;
				
				int r = (int)((1-alpha)*ar + alpha*br);
				int g = (int)((1-alpha)*ag + alpha*bg);
				int b = (int)((1-alpha)*ab + alpha*bb);
				int rgb = (r << 16) + (g << 8) + b;
				
				avg.setRGB(x, y, rgb);
				dst.setRGB(x, y, Math.abs(br - r) < 20? 0x000000: 0xffffff);
			}
		}		
		return dst;
	}
	
	//paint
	@Override
	public void paintComponent(Graphics g) {
		if(mImg != null) {
			g.drawImage(mImg, 0, 0, mImg.getWidth(), mImg.getHeight(), this);
		}
	}
	
	public static void main(String[] args) {
		try {
			System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
			
			Mat capImg = new Mat();
			VideoCapture capture = new VideoCapture(1);
			int height = (int)capture.get(Videoio.CAP_PROP_FRAME_HEIGHT);
			int width = (int)capture.get(Videoio.CAP_PROP_FRAME_WIDTH);
			if(height == 0 || width == 0) {
				throw new Exception("camera not found.");
			}
			
			JFrame frame = new JFrame("camera");
			frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			OpticalFlow_OpenCV panel = new OpticalFlow_OpenCV();
			frame.setContentPane(panel);
			frame.setVisible(true);
			
			frame.setSize(width + frame.getInsets().left + frame.getInsets().right, height + frame.getInsets().top + frame.getInsets().bottom);
			
			BufferedImage binaryImg = null;
			
			while(frame.isShowing()) {
				capture.read(capImg);
				
				binaryImg = panel.mat2BI(capImg);
				panel.mImg = opticalFlow(binaryImg);
				
				panel.repaint();
			}
			
			capture.release();
			frame.dispose();
		}catch(Exception e) {
			System.out.println("例外：" + e);
			e.printStackTrace();
		}finally {
			System.out.println("done.");
		}
	}
}
