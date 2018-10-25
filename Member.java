public class Member implements Comparable<Member> {
  private String id;
  private String name;
  private Gender gender;

  public Member(String id, String name,Gender gender){
    this.id = id;
    this.name = name;
    this.gender = gender;
  }
  public String getId(){
    return this.id;
  }
  public String getName(){
    return this.name;
  }
  public Gender getGender(){
    return this.gender;
  }
  @Override
  public String toString(){
      return this.getId()+ " " + this.getName() + " " +this.getGender();
  }
  @Override
  public int compareTo(Member member1){
      return this.getId().compareTo(member1.getId());
  }
}
