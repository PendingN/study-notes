import java.io.*;
import java.util.*;
class StudentToFile{
    public static <E> boolean writeFile(String path, ArrayList<E> lst){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for(E e:lst){
                bw.write(e.toString());
                bw.newLine();
            }
            return true;
        }
        catch(Exception e){
            System.out.println("loi");
            return false;
        }
    }
}