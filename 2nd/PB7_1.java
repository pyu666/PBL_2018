import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;
public class PB7_1 {
    public static void main(String[] args) {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("C:\\Users\\y_hid\\Downloads\\answerTest1.csv"),Charset.forName("Shift_JIS"));
        } catch(Exception e) {
            System.out.println(e);
        }
        List<Answer> list = new ArrayList<>();
        for (String line: lines) {
            //if (line==) continue;
            String[] data = line.split(",");
            List<String> ques = new ArrayList<>();
            ques.add(data[5]);
            Answer answer = new Answer(data[0],data[1],data[2],data[3],ques);
            list.add(answer);
//            System.out.println(data[0] +" "+data[1]);
        }
        //System.out.println(line.get(0).getName());
        int count=0;
        System.out.println(list.get(1).getQuestionList());
        for (int i = 1; i < list.size(); i++) {
            Answer ls = list.get(i);
            //System.out.println(ls.getQuestionList());
            List<String> str = ls.getQuestionList();
            System.out.println(str);
            if (str.get(0).matches("[0-9]")) {
                System.out.println(Integer.parseInt(str.get(0)));
                count++;
            }
            // if (str.get(0).matches("[0-9]")) {
            //     System.out.println(Integer.parseInt(str.get(0)));
            //     count++;
            // }
        }
        System.out.println(count);

    }

}
