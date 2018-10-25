import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class P6_3 {

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stream = list.stream();
        stream.map(e -> e * e).filter(e -> e % 3 == 0).forEach(e -> System.out.println(e));
        stream.forEach(e ->System.out.println(e));
    }
}
