import java.nio.file.Paths;
import java.util.List;

public class PBL11_1 {
    public static void main(String[] args) {
        List<Member> members = MemberUtil.getList(Paths.get("member.csv"));
        for (Member member:members) {
            System.out.println(member.getId()+" "+ member.getName());
            System.out.println(member.getGender()+" "+member.getPoint());
        }
    }
}
