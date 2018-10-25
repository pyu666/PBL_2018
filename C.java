public class C implements Cloneable{
    B b = null;
    public C (int i){
        this.b = new B(i);
    }
    public int getValue(){
        return this.b.getValue();
    }
    public C clone(){
        C c = null;
        try {
            c = this.getClass().cast(super.clone());
            c.b = this.b.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return c;
    }

}
