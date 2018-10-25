public class E2_main {
        public static void main(String[] args) {
                E2<Integer> e2 = new E2<Integer>(){
                        @Override
                        public Integer x(Integer t){
                                return t;
                        }
                };

                E2<String> e2_ = new E2<String>(){
                        @Override
                        public Integer x(String t){
                                return null;
                        }
                };
        }
}
