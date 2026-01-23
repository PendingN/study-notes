public abstract class Student{
    protected String sName;
    protected double gpa;
    public Student(){
        sName="";
        gpa=0.0;
    }
    public Student(String sName, double gpa){
        this.sName=sName;
        this.gpa=gpa;
    }
    public String getsName(){
        return this.sName;
    }
    public double getGpa(){
        return this.gpa;
    }
    public abstract String getRank();
    @Override
    public String toString(){
        return "Name:"+sName +",GPA: "+gpa+ ",Rank: "+getRank();
    }
}