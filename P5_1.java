import java.util.ArrayList;
import java.util.Collections;

public class P5_1 {
    private static ArrayList <String> list = new ArrayList <>();
    static {
        list.add("album");
        list.add("bag");
        list.add("cherry");
        list.add("dish");
        list.add("eye");
        list.add("face");
        list.add("girl");
        list.add("hair");
        list.add("ice cleam");
        list.add("jacket");
    }
    public static void main(String[] args)
    {
        //        System.out.println(find1(null));
        System.out.println(find4("hair"));
    }

    public static boolean find1(String s)
    {
        for (int i = 0; i < list.size(); i++) {
            //            System.out.println(list.get(i));
            if (list.get(i).equals(s)) {
                return true;
            }
        }

        return false;
    }

    public static boolean find2(String s)
    {
        if (list.indexOf(s) != -1) {
            return true;
        }

        return false;
    }

    public static boolean find3(String s)
    {
        return list.contains(s);
    }

    public static boolean find4(String s)
    {
        if (s == null || list.size() == 0) {
            return false;
        }

        return Collections.binarySearch(list, s) != -1;
    }

    public static boolean find5(String s)
    {
        if (s == null || list.size() == 0) {
            return false;
        }

        return list.get(s.charAt(0) - 'a').equals(s);
    }
}
