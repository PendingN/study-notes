public class Employee{
    private String ID;
    private String fullName;
    private int yearJoined;
    private double coefficientsSalary;
    private int numDaysOff;
    public Employee(){
        this.ID="0";
        this.fullName="";
        this.yearJoined=2020;
        this.coefficientsSalary=1.0;
        this.numDaysOff=0;
    }
    public Employee(String ID, String fullName, double coefficientsSalary){
        this.ID=ID;
        this.fullName=fullName;
        this.coefficientsSalary=coefficientsSalary;
        this.yearJoined=2020;
        this.numDaysOff=0;
    }
    public void setYearJoined(int yearJoined){
        this.yearJoined=yearJoined;
    }
    public void setNumDaysOff(int numDaysOff){
        this.numDaysOff=numDaysOff;
    }
    public double getSenioritySalary(){
        int currentYear=java.time.Year.now().getValue();
        int yearsOfWork= currentYear-this.yearJoined;
        double basicSalary=1150;
        if(yearsOfWork>=5){
            return yearsOfWork*basicSalary/100;
        }
        else{
            return 0.0;
        }
    }
    public String considerEmulation(){
        if(numDaysOff<=1){
            return "A";
        }
        else if(numDaysOff>=2&&numDaysOff<=3){
            return "B";
        }
        else{
            return "C";
        }
    }
    public double getSalary(){
        double basicSalary=1150;
        double emulation;
        String grade=considerEmulation();
        if(grade.equals("A")){
            emulation=1.0;
        }
        else if(grade.equals("B")){
            emulation=0.75;
        }
        else{
            emulation=0.5;
        }
        double salary= basicSalary+basicSalary*(coefficientsSalary+emulation)+getSenioritySalary();
        return salary;
    }
    @Override
    public String toString() {
        return "Employee ID: " + ID +"\nFull Name: " + fullName +"\nYear Joined: " + yearJoined +"\nCoefficient Salary: " + coefficientsSalary +"\nDays Off: " + numDaysOff +"\nEmulation Grade: " + considerEmulation() +"\nSeniority Salary: " + getSenioritySalary() +"\nTotal Salary: " + getSalary() +"\n--------------------------------------";
    }

}