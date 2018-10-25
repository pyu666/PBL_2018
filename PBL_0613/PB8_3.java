import java.util.*;
import java.io.*;
import java.nio.file.Paths;
import java.util.List;
public class PB8_3 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        File file = new File("f.conf.xml");
        try (InputStream in = new FileInputStream(file)) {
            properties.loadFromXML(in);
        } catch(Exception e) {
            e.printStackTrace();
        }
        int id = Integer.parseInt(properties.getProperty("id"+ ""));
        int score = Integer.parseInt(properties.getProperty("score" + ""));
        int gender = Integer.parseInt(properties.getProperty("gender"));
        List<Member> members = MemberUtil.getList(Paths.get("member.csv"),id,1,gender,score);
        for (Member member:members) {
            System.out.println(member.getId()+" "+ member.getName());
            System.out.println(member.getGender()+" "+member.getPoint());
        }
    }
}
