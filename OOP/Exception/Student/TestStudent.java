import java.util.*;
class TestStudent{
    public static void main(String[] args){
        ArrayList <Student> lstStu = new ArrayList<>();
        lstStu.add(new Student("Hello",2,3.2));
        if(StudentToFile.writeFile("student.txt",lstStu)){
            System.out.println("Good!!");
        }
        else{
            System.out.println("Failed!!");
        }
    }
}