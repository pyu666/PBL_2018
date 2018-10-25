public class P8_3{
    public static void main(String[] args) {
        C c1 = new C(1);
        C c2 = c1.clone();
        c1.b.i = 2;
        System.out.println(c1.getValue());
        System.out.println(c2.getValue());
    }
}
