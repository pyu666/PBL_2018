import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
public class R3_1{
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(3,2,1);
    for (Iterator<Integer> ite = list.iterator();ite.hasNext() ; ) {
      Integer i = ite.next();
      System.out.println(i);
    }
    for (Integer integer : list) {
      System.out.println(integer);
    }
  }
}
