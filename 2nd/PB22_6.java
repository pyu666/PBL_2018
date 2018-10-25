import java.util.function.Function;
public class PB22_6 {
    public static void main(String[] args) {
        Function<Integer,String> funct = e->e + "ten";
        printFunction(funct,80);

        Function<String,String> funct2 = e->e + "kun";
        printFunction(funct2,"nishigaki");
    }
    public static <T>void printFunction(Function funct, T i){
        System.out.println(funct.apply(i));
    }
    // public static void printFunction(Function<String,String>func,String str){
    //     System.out.println(func.apply(str));
    // }

}
