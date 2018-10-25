public class B implements Cloneable{

    int i;
    public B(int i){
        this.i = i;

    }
    public int getValue(){
        return this.i;
    }
    public B clone(){
        B b = null;
        try {
            b = (B)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return b;
    }
}
