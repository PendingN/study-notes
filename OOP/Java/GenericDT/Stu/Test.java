public class Test{
    public static ArrayList<student> findStudent(ArrayList<Student> lstStu){
        ArrayList<Student> result=new ArrayList<>();
        for(Student s: lstStu){
            String rank= s.getRank();
            if(rank.equals("A")||rank.equals("pass")){
                result.add(s);
            }
        }
        return result;
    }
    public static void main(string[] args){
        ArrayList<Student> list= new ArrayList<>();
        list.add(new ITStudent(1,"An",9.0));
        list.add(new ITStudent(2,"Jk",8.0));
        list.add(new MathStudent("A13","mr.Gold"));
        list.add(new MathStudent("A13","dr.Giao"));
    }
    
}