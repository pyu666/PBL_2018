import java.util.List;
import java.util.*;
import java.lang.Comparable;
//import java.
public class Answer implements Comparable<Answer>{
    private String course;
    private String userName;
    private String userId;
    private String time;
    private List<String> questionList;

    public Answer(String course,String userName,String userId,String time,List<String> questionList){
        this.course = course;
        this.userId = userId;
        this.userName = userName;
        this.time = time;
        this.questionList = questionList;
    }
    public String getCourse(){
        return this.course;

    }
    public String getUserName(){
        return this.userName;

    }
    public String getTime(){
        return this.time;
    }
    public List<String> getQuestionList(){
        return this.questionList;
    }
    @Override
    public String toString(){
        return this.userName+""+this.userId;

    }
    @Override
    public int compareTo(Answer a2){
        return 0;
    }
}
