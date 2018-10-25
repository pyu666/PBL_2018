import java.util.ArrayList;
import java.util.Collections;

public class P5_2 {
    private static ArrayList <Member> list = new ArrayList <>();
    static {
        list.add(new Member("00IE00", "miya", Gender.MALE));
        list.add(new Member("00ID00", "kohama", Gender.MALE));
        list.add(new Member("14JKM17", "horikawa", Gender.FEMALE));
        list.add(new Member("14JKM13", "harakawa", Gender.MALE));
        list.add(new Member("14JKM18", "matsui", Gender.MALE));
        Collections.sort(list);
    }
    public static void main(String[] args)
    {
        System.out.println(find1("00IE00"));
    }

    public static boolean find(String id)
    {
        for (int i = 0; i < list.size(); i++) {
            // System.out.println(list.get(i));
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }

        return false;
    }

    public static boolean find1(String id)
    {
        return Collections.binarySearch(list, new Member(id, null, null)) >= 0;
    }
}
