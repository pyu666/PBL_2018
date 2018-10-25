import java.nio.file.Paths;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class PBL11_1 {
    public static void main(String[] args) {
        int name = 0;
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("id",0);
        map.put("name",1);
        map.put("gender",3);
        map.put("score",2);
        List<Member> members = MemberUtil.getList(Paths.get("member2.csv"),map.get("id"),map.get("name"),map.get("gender"),map.get("score"));
        for (Member member:members) {
            System.out.println(member.getId()+" "+ member.getName());
            System.out.println(member.getGender()+" "+member.getPoint());
        }
    }
}
