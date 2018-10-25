import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MemberUtil2 {
    public static List<Member> getList(Path path){
        List<String> lines = null;
        List<Member> members = new ArrayList<Member>();
        try {
            lines = Files.readAllLines(path, Charset.forName("Shift_JIS"));
        } catch(Exception e) {
            System.out.println("ex");
        }
        // for (String line:lines) {
        //     String[] data = line.split(",");
        //     members.add(new Member(data[0],data[1],Gender.valueOf(data[2])));
        //     Member member = members.get(members.size()-1);
        //     member.setPoint(Integer.valueOf(data[3]));
        // }
        String str = lines.get(0);
        String[] title = str.split(",");
        System.out.println(lines.get(0));
        //String[] data.sprit(",");
        int id=0,name=1,gender=2,point=3;


        for (int i = 0; i < 4; i++ ) {
            if (title[i].matches("........")) {
                id = i;
            }else if (title[i].equals("MALE") ||title[i].equals ("FEMALE")) {
                gender = i;
            }else if (title[i].matches("^\\d{1,3}$")) {
                point = i;
            }else{
                name = i;
            }
        }


        for (String line:lines) {
            String[] data = line.split(",");
            members.add(new Member(data[id],data[name],Gender.valueOf(data[gender])));
            Member member = members.get(members.size()-1);
            member.setPoint(Integer.valueOf(data[point]));
        }
        return members;
    }

}
