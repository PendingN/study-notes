public class ITStudent extends Student{
    private int sID;
    public ITStudent(){
        super();
        sID=0;
    }
    public ITStudent(int sID, String sName, double gpa){
        super(sName,gpa);
        this.sID=sID;
    }
    @Override
    public String getRank(){
        if(gpa<=5)
            return "C";
        else if(gpa<=8)
            return "B";
        else
            return "A";
    }
    @Override
    public String toString(){
        return "ITStudent[ID="+sID+"]"+super.toString();
    }
}