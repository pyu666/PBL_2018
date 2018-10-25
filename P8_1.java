public class P8_1{
    public static void main(String[] args) {
        A a1 = new A(1);
        A a2 = a1.clone();
        a1.i = 2;
        System.out.println(a1.i);
        System.out.println(a2.i);
    }
}
