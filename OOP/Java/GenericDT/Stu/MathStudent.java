public class MathStudent extends Student{
    private String sID;
    public MathStudent(){
        sID="";
    }
    public MathStudent(String sID, String sName, double gpa){
        super(sName,gpa);
        this.sID=sID;
    }
    @Override
    public String getRank(){
        if(gpa>=5)
            return "pass";
        else
            return "fail";
    }
    @Override
    public String toString(){
        return "MathStudent[ID="+sID+"]"+super.toString();
    }
}