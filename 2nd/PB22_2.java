public class PB22_2 {
    public static void main(String[] args) {
        F<String,String> f = new F<String,String>(){
            @Override
            public String x (String t){
                return null;
            }
        };
        F<Integer,String> f2 = (e)->{return e + "点";};
        System.out.println(f2.x(4));
        F<Integer,Integer> f3 = (e)->{return e * e;};
    }
}
