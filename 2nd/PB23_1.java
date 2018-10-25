import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.Collections;
public class PB23_1 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student ("17jkm16","nishigaki"),
            new Student("17jkm04","iwamoto"),
            new Student("18jkm13","kondo")
            );
        System.out.println("---------Before---------");
        //    list.forEach(e->System.out.println(e.getId()+" "+e.getName()));

        // Collections.sort(list,new Comparator<Student>() {
        //     @Override
        //     public int compare(Student a,Student b){
        //         int p = Integer.parseInt(a.getId().substring(5,7));
        //         int q = Integer.parseInt(b.getId().substring(5,7));
        //         //System.out.println(q);
        //         return p-q;
        //     }
        // });
        // list.forEach(e->System.out.println(e.getId()+" "+e.getName()));

        // list.stream().sorted((a,b)->Integer.parseInt(a.getId().substring(5,7)) - Integer.parseInt(b.getId().substring(5,7))).forEach(e->System.out.println(e.getId()+" "+e.getName()));
        // System.out.println("---------After----------");
        Function<Student,String> f = s->s.getId().substring(5,7);
        Comparator<String> c = (a1,a2)->Integer.parseInt(a1) - Integer.parseInt(a2);
        // Comparator<Student> c_s = (s1,s2)->c.compare(f.apply(s1), f.apply(s2));
        // list.forEach(e->System.out.println(e.getId()+" "+e.getName()));
//        list.sort(getComparator(f, c));
//        list.forEach(e->System.out.println(e.getId()+" "+e.getName()));
        list.sort(reversedComparator(Comparator.comparing(f,c)));
        list.forEach(e->System.out.println(e.getId()+" "+e.getName()));

    }

    public static<T,R> Comparator<T> getComparator(Function<T,R> f, Comparator<R> c){
        //Comparator<T> c_s = (s1,s2)->c.compare(f.apply(s1), f.apply(s2));
        //return c_s;
        return (s1,s2)->c.compare(f.apply(s1), f.apply(s2));
    }
    public static<T> Comparator<T> reversedComparator(Comparator<T> c){
        return c.reversed();
    }
}
