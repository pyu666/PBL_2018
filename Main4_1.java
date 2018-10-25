import java.util.List;
import java.util.Arrays;

public class Main4_1{
  public static void main(String[] args) {
    List<Human> humanList = Arrays.asList(
        new Human("‘å‹´","‚¯‚ñ‚¢‚¿"),
        new Human("’|ƒm“à","‚Ì‚¤‚¿"),
        new Human("“cŽq",null)
            );

    for (int i = 0; i< humanList.size() ;i++) {
        Human human = humanList.get(i);
        // if (human.getnickName() != null) {
        //     System.out.println(human.getnickName());
        //}
        System.out.println(human.getName() + "‚Ì‚ ‚¾–¼‚Í" +human.getnickName().orElse("‚È‚¢")+"‚Å‚·B");

    }
  }
}
