import java.util.Optional;

public class R5_1 {
    public static void main(String[] args) {
        System.out.println(method1(null));
        System.out.println(method1("c"));
    }

    public static String method1 (String s){
        if (s == null) {
            return "a";
        }else {
            return s;
        }

    }
}
