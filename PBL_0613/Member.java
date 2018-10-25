public class Member {
    private String id;
    private String name;
    private Gender gender;
    private int point;

    public Member(String id,String name, Gender gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }

    public String getId(){
        return this.id;
    }

    public Gender getGender(){
        return this.gender;
    }

    public int getPoint(){
        return this.point;
    }

    public void setPoint(int point){
        this.point = point;
    }
}
