import java.util.Optional;
public class R5_0 {
    public static void main(String[] args) {
        System.out.println(method1(true));
        System.out.println(method1(false));
    }
    public static String method1(boolean c){
        return Optional.of("a").filter(v->c).orElse("b");

        //     if(c) {
        //         return "a";
        //     }else{
        //         return "b";
        //     }
    }
}
