import java.io.File;
import java.util.Properties;
import java.io.OutputStream;
import java.io.FileOutputStream;
public class PB8_1 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("id","0");
        properties.setProperty("score","1");
        properties.setProperty("gender","2");

        File file = new File("f.conf.xml");

        try (OutputStream os = new FileOutputStream(file)) {
            properties.storeToXML(os,"設定ファイル");
        } catch(Exception e) {

        }
    }
}
