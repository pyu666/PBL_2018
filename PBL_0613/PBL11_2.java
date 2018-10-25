import java.nio.file.Paths;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class PBL11_2 {
    public static void main(String[] args) {
        List<Member> members = MemberUtil2.getList(Paths.get("member.csv"));
        for (Member member:members) {
            System.out.println(member.getId()+" "+ member.getName());
            System.out.println(member.getGender()+" "+member.getPoint());
        }
    }
}
