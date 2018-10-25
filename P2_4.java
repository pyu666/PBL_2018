import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class P2_4{
  public static void main(String[] args) {
      List<String> list = Arrays.asList("1","2","0","11","4");
      Collections.sort(list);
      for (String number: list) {
        System.out.println(number);
      }
      // MyComparator myComparator = new MyComparator();
      // Collections.sort(list,myComparator);
      // for (String number: list) {
      //   System.out.println(number);
      // }
      Comparator<String> myComparator = new Comparator<String>(){
        public int compare(String number1, String number2){
          Integer a = Integer.parseInt(number1);
          Integer b = Integer.parseInt(number2);
          return a.compareTo(b);
        }
      };
      Collections.sort(list,myComparator);
      for (String number: list) {
        System.out.println(number);
      }

  }
}
