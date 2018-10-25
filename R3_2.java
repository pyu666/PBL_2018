import java.util.Iterator;
public class R3_2{
  public static void main(String[] args) {
    MyList list = new MyList();
    for (Iterator<Integer> ite = list.iterator();ite.hasNext(); ) {
      Integer i = ite.next();
      System.out.println(i);
    }
    for (Integer integer : new MyList3()) {
      System.out.println(integer);
    }
  }
}
