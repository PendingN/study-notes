public class Student extends Person{
    private String id;
    private double score;
    public Student(){
        super();
        id="";
        score=0.0;
    }
    public Student( String id, int score,String name, int birthYear){
        super(name,birthYear);
        this.id=id;
        this.score=score;
    }
    public String getId(){
        return this.id;
    }
    public double getScore(){
        return this.score;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setScore(double score){
        this.score=score;
    }
    @Override
    public String toString(){
        return "Student:"+super.toString()+",Id="+id+",Score="+score;
    }
}