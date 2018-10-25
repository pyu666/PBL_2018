import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class P6_2 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        for (Integer i:list)if(i % 2 == 1) System.out.println(i);
        Stream<Integer> stream = list.stream();
        stream.filter(e -> e % 2 == 1 ).forEach(e -> System.out.println(e));
    }
}
