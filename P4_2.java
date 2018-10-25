import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class P4_2{
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        list.add(new Member("18jkm03","ebihara",Gender.FEMALE));
        list.add(new Member("18jkm13","kondou",Gender.MALE));
        list.add(new Member("00ID00","miya",Gender.MALE));
        list.add(new Member("00IE00","kohama",Gender.MALE));
        list.add(new Member("17jkm16","nishigaki",Gender.MALE));
        Collections.sort(list);
        // for (Member m: list) {
        //     System.out.println(m);
        // }
        Comparator<Member> myComparator = new Comparator<Member>(){
            @Override
            public int compare(Member m1, Member m2){
                String a = m1.getName();
                String b = m2.getName();
                return a.compareTo(b);
            }
        };
        Collections.sort(list, myComparator);
        for (Member m: list) {
            System.out.println(m);
        }
        Collections.sort(list, new Comparator<Member>(){
            @Override
            public int compare(Member m1,Member m2){
                return m1.getGender().compareTo(m2.getGender());
            }
        });


        // for(Member m:list){
        //     System.out.println(m);
        // }
        System.out.println();
        list.sort((o1,o2) -> o1.getName().compareTo(o2.getName()));
        list.forEach(e -> System.out.println(e));
        System.out.println();
        list.stream().sorted((o1,o2) -> o1.getName().compareTo(o2.getName())).forEach(System.out::println);
        // for (Member m: list) {
        //     System.out.println(m);
        // }
    }
}
