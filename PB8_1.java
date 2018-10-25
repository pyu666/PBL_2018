import java.io.file;
import java.util.Properties;


public class PB8_1 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("id","0");
        properties.setProperty("score","1");
        properties.setProperty("gender","2");

        File file = new File("f.conf.xml");

        try (OuputStream os = new FileOutputStream(file)) {
            properties.storeToXML(os,"設定ファイル");
        } catch(Exception e) {

        }
    }
}
