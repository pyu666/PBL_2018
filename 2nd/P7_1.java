import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Collection;
import java.util.TreeMap;
import java.util.TreeSet;
public class P7_1 {
    public static void main(String[] args){
        // Your code here!
        List<ExamResult> list = Arrays.asList(
            new ExamResult("14aj001",90),
            new ExamResult("14aj002",79),
            new ExamResult("14aj003",82),
            new ExamResult("14aj004",59),
            new ExamResult("13aj001",75),
            new ExamResult("13aj002",97),
            new ExamResult("13aj003",63),
            new ExamResult("13aj004",70)
            );
        Map<ExamResult.Rank,Collection<ExamResult>> map = list.stream().collect(Collectors.groupingBy(e->e.getRank(),TreeMap::new,Collectors.toCollection(TreeSet<ExamResult>::new)));
        map.entrySet().stream().forEach(e->System.out.println(e.getValue()));

        // System.out.println();
        // map.keySet().tream().sorted().forEach(e->{
        //     List<ExamResult>list2 = map.get(e);
        //     System.out.println(list2);
        // })
         }
}
