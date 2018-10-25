import java.util.function.Consumer;
import java.util.List;
import java.util.Arrays;
public class P12_2 {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>(){
            @Override
            public void accept(String str){
                System.out.println(str);
            }
        };
        List<String> list = Arrays.asList("c","a","b","d");
        list.forEach(consumer);
        list.forEach(e->System.out.println(e));
    }
}
