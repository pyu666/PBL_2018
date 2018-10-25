import java.util.List;
import java.util.Arrays;

public class P2_3{
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 0, 11, 4);
    for (int i = 0;i < list.size() ; i++) {
      System.out.println(list.get(i));
    }
    for (Integer number: list) {
      System.out.println(number);
    }
    sort(list);
  }
  public static void sort(List<Integer> list){
    for (int p = 0;p < list.size()-1; p++) {
      for(int i = 0; i < p; i++){
      if (list.get(i) < list.get(i+1)) {
        Integer a = list.get(i);
        list.set(i, list.get(i + 1));
        list.set(i + 1, a);
        }
      }
    }
  }


}
