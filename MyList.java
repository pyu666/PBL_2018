import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList{
  private List<Integer> list = new ArrayList<>();
  {
    this.list.add(3);
    this.list.add(2);
    this.list.add(1);
  }
  public Iterator<Integer> iterator(){
    return this.list.iterator();
  }
}
