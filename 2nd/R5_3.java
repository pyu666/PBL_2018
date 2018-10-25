import java.util.Optional;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class R5_3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a",null,"c");
        List<String> list2 = getList(list);
        list2.forEach(e->System.out.println(e));
    }

    public static String method1 (String b){
        Optional<String> str = Optional.ofNullable(b);
        System.out.println(str);
        System.out.println(str.isPresent());
        if (str.isPresent()) {
            return b;
        }else {
            return "a";
        }
    }
    public static List<String> getList(List<String> list){
        List<String> ls = new ArrayList<>();
        for (String s : list) {
            ls.add(method1(s));
        }
        return ls;
    }
}
