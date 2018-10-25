import java.util.*;
import java.util.function.Consumer;
public class PB22_5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","book","cherry","door","element");
        Consumer<String> consumer2 = e->System.out.println(e);
        list.forEach(e->execute(consumer2,e));
        list.forEach(str->execute(e->System.out.println(e),str));
    }
    public static void execute(Consumer<String> consumer,String str){
        consumer.accept(str);
    }
}
