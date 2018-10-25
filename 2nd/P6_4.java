import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class P6_4 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Stream<Integer> stream = list.stream();
        list.add(3);
        //stream.forEach(e -> System.out.println(e));
        int five = 5;
        stream.forEach(e -> System.out.println(e + five));
        //five = five + 3;
    }
}
