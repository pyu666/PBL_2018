import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P7_0 {

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
        Map<ExamResult.Rank,List<ExamResult> > map = list.stream().collect(Collectors.groupingBy(e->e.getRank()));
        map.entrySet().stream().forEach(e->System.out.println(e.getValue()));
    }
}
