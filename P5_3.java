import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class P5_3 {
    private static HashMap <String, Member> map = new HashMap <>();
    static {
        ArrayList <Member> list = new ArrayList <>();
        list.add(new Member("00IE00", "miya", Gender.MALE));
        list.add(new Member("00ID00", "kohama", Gender.MALE));
        list.add(new Member("14JKM17", "horikawa", Gender.FEMALE));
        list.add(new Member("14JKM13", "harakawa", Gender.MALE));
        list.add(new Member("14JKM18", "matsui", Gender.MALE));

        for (Member member : list) {
            map.put(member.getId(), member);
        }
    }
    public static void main(String[] args)
    {
        // System.out.println(find("00ID00"));
        System.out.println(map.values());

        List <String> keys = new ArrayList <>(map.keySet());
        Collections.sort(keys);
        for (String id : keys) {
            System.out.println(map.get(id));
        }
        // ArrayList<Member> list = new ArrayList<>();
        // list.addAll(map.values());
        // Collections.sort(list);
        // for (int i = 0;i < list.size() ;i++ ) {
        //     System.out.println(list.get(i));
        // }
    }

    public static boolean find(String id)
    {
        return map.containsKey(id);
    }
}
