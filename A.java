public class A {
    int i;
    public A(int i){
        this.i = i;
    }
    public int getValue(){
        return this.i;
    }
    @Override
    public A clone(){
        return null;
    }
}
