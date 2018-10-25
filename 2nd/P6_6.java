import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class P6_6 {
    public static void main(String[] args) {
        List<ExamResult> list = Arrays.asList(
                new ExamResult("13aj001", 72),
                new ExamResult("13aj002", 97),
                new ExamResult("13aj003", 63),
                new ExamResult("13aj004", 70),
                new ExamResult("14aj001", 90),
                new ExamResult("14aj002", 79),
                new ExamResult("14aj003", 82),
                new ExamResult("14aj004", 59));

        Map<String,List<ExamResult>> map= list.stream().collect(Collectors.groupingBy(e -> e.getRank()));
        System.out.println(map);
    }
}
