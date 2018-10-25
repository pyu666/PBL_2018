import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P6_5 {
    public static void main(String[] args){
        Arrays.asList(1,2,3).stream().forEach(e-> System.out.println(e));
        List<Integer> list = Arrays.asList(4,5,6).stream().map(e -> e * 2).collect(Collectors.toList());
        list.forEach(e->System.out.println(e));
    }
}
