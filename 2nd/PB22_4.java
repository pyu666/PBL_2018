import java.util.List;
import java.util.Arrays;
public class PB22_4 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student("16JK209","hidaka"),
            new Student("15JK070","kato"),
            new Student("15JK171","sato")
            );
        list.forEach(e->{System.out.println(e.getName()+" "
                                            +e.getId());});
    }
}
