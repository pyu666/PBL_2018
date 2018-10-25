import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//import java.streaming.*;
public class R5_5 {
    public static void main(String[] args) {
        List <String> list= Arrays.asList("a",null,"c");
        List <String> list2 = list.stream().map(e->method1(e)).collect(Collectors.toList());
        list2.forEach(e->System.out.println(e));

    }
    public static String method1(String s){
        String str = null;
        if (s == null) {
            str = "a";
        }else{
            str = s;
        }
        return str;
    }
}
