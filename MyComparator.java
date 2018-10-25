import java.util.Comparator;
public class MyComparator implements Comparator<String>{
  public int compare(String number1,String number2){
  int a = Integer.parseInt(number1);
  int b = Integer.parseInt(number2);
  return a - b;
  }
}
