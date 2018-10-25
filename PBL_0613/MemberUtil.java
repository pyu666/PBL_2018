import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class MemberUtil {
    public static List<Member> getList(Path path,int id,int name,int gender,int score){
        List<String> lines = null;
        List<Member> members = new ArrayList<Member>();
        try {
            lines = Files.readAllLines(path, Charset.forName("Shift_JIS"));
        } catch(Exception e) {
            System.out.println("ex");
        }
        for (String line:lines) {
            String[] data = line.split(",");
            members.add(new Member(data[id],data[name],Gender.valueOf(data[gender])));
            Member member = members.get(members.size()-1);
            member.setPoint(Integer.valueOf(data[score]));
        }
        return members;
    }

}
