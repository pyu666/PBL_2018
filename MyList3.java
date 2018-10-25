import java.util.Iterator;
import java.util.NoSuchElementException;
public class MyList3 implements Iterable<Integer>{
    private Integer[] list = {3,2,1};

    @Override
    public Iterator<Integer> iterator(){
      Iterator<Integer> iterator = new Iterator<Integer>(){
        private int i = 0;
        public boolean hasNext(){
//          return this.i < MyList3.this.list.length ? true : false;
           if (i < list.length) {
             return true;
          }else{
            return false;
          }

        }
        public Integer next(){
//          int p = MyList3.this.list[i];
//          i++;
//          return p;
//            return MyList3.this.list[i++];
            try {
              return  MyList3.this.list[i++];
            } catch(Exception e) {
              throw new NoSuchElementException();
            }
        }
    };
      return iterator;
    }
}
