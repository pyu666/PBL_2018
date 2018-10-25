public class F_main {
        public static void main(String[] args) {
                F<Integer,Integer> f = new F<Integer,Integer>(){
                        @Override
                        public Integer x(Integer t){
                                return null;
                        }
                };
                F<String,String> f_ = new F<String,String>(){
                        @Override
                        public String x(String t){
                                return null;
                        }
                };
                F<Integer,String> F__ = new F<Integer,String>(){
                        @Override
                        public String x(Integer t){
                                return null;
                        }
                };
        }
}
