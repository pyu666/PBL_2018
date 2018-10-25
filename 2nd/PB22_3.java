import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class PB22_3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Nishigeki","Iwamoto","Kondo","Ebihara","Morishita");
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String t){
                System.out.println(t);
            }
        };
        list.forEach(consumer);
        Consumer <String> consumer2 = (e)->{System.out.println(e);};
        list.forEach(e->System.out.println(e));
    }
}
