import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays;

public class P6_1 {

    public static void main(String[] args){
        List<ExamResult> s = new ArrayList<>();
        List<ExamResult> A = new ArrayList<>();
        List<ExamResult> B = new ArrayList<>();
        List<ExamResult> C = new ArrayList<>();
        List<ExamResult> D = new ArrayList<>();
        List<ExamResult> list= Arrays.asList(
        new ExamResult("13aj001",72),
        new ExamResult("13aj002",97),
        new ExamResult("13aj003",63),
        new ExamResult("13aj004",70),
        new ExamResult("14aj001",90),
        new ExamResult("14aj002",79),
        new ExamResult("14aj003",82),
        new ExamResult("14aj004",59));
        list.forEach(e -> System.out.println(e));
        String[] rank = {"S","A","B","C","D"};
        for (ExamResult member: list) {
            if (member.getRank().equals("S")) {
                s.add(member);
            }
        }

    }
}
