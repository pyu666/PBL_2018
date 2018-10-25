import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;

public class R5_4 {
    public static void main(String[] args) {
        List <String> list= Arrays.asList("a",null,"c");
        List <String> list2 = list.stream().map(e->method1(e)).collect(Collectors.toList());
        list2.forEach(e->System.out.println(e));

    }
    public static String method1(String s){
        //Optional<String> str = Optional.ofNullable(s);
        //return str.orElse("a");
        return Optional.ofNullable(s).orElse("a");
        //return null is "a",else return sonomama;
    }
}
