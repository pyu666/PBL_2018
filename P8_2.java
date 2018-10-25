public class P8_2{
    public static void main(String[] args) {
        B b1 = new B(1);
        B b2 = b1.clone();
        b1.i = 2;
        System.out.println(b1.i);
        System.out.println(b2.i);
    }
}
