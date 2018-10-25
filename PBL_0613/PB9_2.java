import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PB9_2 {
    public static void main(String[] args) {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("member.csv"), Charset.forName("Shift_JIS"));
        } catch(Exception e) {
            System.out.println("ex");
        }
        List<Member> members = new ArrayList<Member>();
        int sum = 0;
        for (String line:lines) {
            String[] data = line.split(",");
            members.add(new Member(data[0],data[1],Gender.valueOf(data[2])));
            Member member = members.get(members.size()-1);
            member.setPoint(Integer.valueOf(data[3]));
            sum = sum + Integer.valueOf(data[3]);
        }
        for (Member m: members) {
            System.out.println(m.getName()+" " +m.getId()+" "+ m.getGender()+ " "+m.getPoint() );
        }
        System.out.println("average : "+sum/members.size());

    }
}
