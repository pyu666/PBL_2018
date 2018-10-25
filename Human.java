import java.util.Optional;

public class Human {
    private String name;
    private String nickName;

    public Human(String name,String nickName){
      this.name = name;
      this.nickName = nickName;
    }
    public String getName(){
      return this.name;
    }
    public Optional<String> getnickName(){
      // return this.nickName;
      return Optional.ofNullable(this.nickName);
    }
}
