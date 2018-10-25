public class PB8_2{
    public static void main(String[] args) {
        Properties properties = new Properties();
        File file = new File("f.conf.xml");
        try (InputStream in = new FileImputSteram(file)){
            properties.loadFromXML(in);
        } catch(Exception e) {
        }
        System.out.print(properties.getProperty("id"+ "" );
        System.out.print(properties.getProperty("score") + " ");
        System.out.println(properties.getProperty("gender"));
    }
}
