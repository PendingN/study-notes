class Student{
    String sName;
    int sID;
    double gpa;
    public Student(String sName, int sID, double gpa) {
        this.sName = sName;
        this.sID = sID;
        this.gpa = (double) gpa;
    }
    public String toString(){
        return sID + " - " + sName + " - " + gpa;
    }
}