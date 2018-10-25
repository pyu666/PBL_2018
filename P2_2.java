public class P2_2{
  public static void main(String[] args) {
    MyPrinter myprinter = new MyPrinter(){
      @Override
      public void print(){
        System.out.println("Hello World");
      }
    };
    myprinter.print();
  }
}
