public class Employee extends Person{
    private String id;
    private double salary;
    public Employee(){
        super();
        id="";
        salary=0.0;
    }
    public Employee(String id, double salary,String name, int birthYear){
        super(name,birthYear);
        this.id=id;
        this.salary=salary;
    }
    public String getId(){
        return this.id;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    @Override
    public String toString(){
        return "Employee:"+super.toString()+",Id="+id+",salary="+salary;
    }
}