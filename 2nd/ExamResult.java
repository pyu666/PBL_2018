public class ExamResult implements Comparable<ExamResult>{
    private String id;
    private int score;
    private Rank rank;

    public ExamResult(String id, int score){
        this.id = id;
        this.score = score;
        setRank(this.score);
    }
    private void setRank(int score){
        this.rank = score >=90 ? Rank.S : score >= 80 ? Rank.A : score >= 70 ? Rank.B : score >= 60 ? Rank.C : Rank.D;
    }
    public String getId(){
        return this.id;
    }
    public int getScore(){
        return this.score;
    }
    public Rank getRank(){
        return this.rank;
    }
    // private void setRank(int score){
    //     if(score >= 90) {
    //         this.rank="S";
    //     }else if (score>= 80) {
    //         this.rank="A";
    //     }else if(score>=70) {
    //         this.rank="B";
    //     }else if (score>=60) {
    //         this.rank="C";
    //     }else {
    //         this.rank = "D";
    //     }
    // }
    @Override
    public String toString(){
        //return String.format("%s(%d点)",this.id,this.score);
        return "ExamResult [id = "+id+",score="+score+"]";
    }
    public enum Rank {
        S,A,B,C,D
    }
    @Override
    public int compareTo(ExamResult arg0){
        return this.getId().compareTo(arg0.getId());
    }
}
