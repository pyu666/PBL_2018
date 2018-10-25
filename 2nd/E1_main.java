public class E1_main {
        public static void main(String[] args) {
                E1 e1 = new E1(){
                        @Override
                        public Integer x (Integer t){
                                return t;
                        }
                };
                System.out.println(e1.x(3));
        }
}
