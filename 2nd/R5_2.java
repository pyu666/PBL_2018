import java.util.Optional;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class R5_2 {
    public static void main(String[] args) {
        List<Boolean> list = Arrays.asList(false,true,false);

        List<String> list2 = getList(list);
        list2.forEach(e->System.out.println(e));
    }

    public static String method1 (boolean b){
        String str = "";
        if (b) {
            str = "a";
        }else {
            str = "b";
        }
        return str;

    }
    public static List<String> getList(List<Boolean> list){
        List<String> lis = new ArrayList<>();
        for (boolean b:list) {
            //String s = method1(b);
            lis.add(method1(b));
        }
        return lis;
    }
}
