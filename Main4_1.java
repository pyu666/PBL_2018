import java.util.List;
import java.util.Arrays;

public class Main4_1{
  public static void main(String[] args) {
    List<Human> humanList = Arrays.asList(
        new Human("大橋","けんいち"),
        new Human("竹ノ内","のうち"),
        new Human("田子",null)
            );

    for (int i = 0; i< humanList.size() ;i++) {
        Human human = humanList.get(i);
        // if (human.getnickName() != null) {
        //     System.out.println(human.getnickName());
        //}
        System.out.println(human.getName() + "のあだ名は" +human.getnickName().orElse("ない")+"です。");

    }
  }
}
