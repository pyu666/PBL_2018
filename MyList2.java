import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class MyList2 implements Iterable<Integer>{
  private List<Integer> list = new ArrayList<>();
  {
    this.list.add(3);
    this.list.add(2);
    this.list.add(1);
  }
  @Override
public Iterator<Integer> iterator(){
  return this.list.iterator();
}
}
