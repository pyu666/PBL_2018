public class ExamResult {
    private String id;
    private int score;
    private String rank;

    public ExamResult(String id, int score){
        this.id = id;
        this.score = score;
        setRank(score);
    }

    public String getId(){
        return this.id;
    }
    public int getScore(){
        return this.score;
    }
    public String getRank(){
        return this.rank;
    }
    private void setRank(int score){
        if(score >= 90) {
            this.rank="S";
        }else if (score>= 80) {
            this.rank="A";
        }else if(score>=70) {
            this.rank="B";
        }else if (score>=60) {
            this.rank="C";
        }else {
            this.rank = "D";
        }
    }
    @Override
    public String toString(){
        return String.format("%s(%d点)",this.id,this.score);
    }
}
