import java.util.ArrayList;
public class PersonModel <T> {
    private ArrayList<T> al = new ArrayList<T>();
    public void add(T obj) {
        al.add(obj);
    }
    public void display() {
        for (T obj : al) {
            System.out.println(obj);
        }   
    }
    public static void main(String[] args) {
        PersonModel<Student> listStu= new PersonModel<Student>();
        listStu.add(new Student("Nguyen Van A",2007,"3310",8));
        listStu.add(new Student("Nguyen Van B",2006,"1203",7));
        listStu.display();
        PersonModel<Employee> listEmp= new PersonModel<Employee>();
        listEmp.add(new Employee("Nguyen Van C",1991,"3310",1200));
        listEmp.add(new Employee("Nguyen Van D",1998,"1203",1300));
        listEmp.display();
        PersonModel<Person> listPer= new PersonModel<Person>();
        listPer.add(new Person("Nguyen Van E",2000));
        listPer.add(new Person("Nguyen Van F",2003));
        listPer.display();
    }
}