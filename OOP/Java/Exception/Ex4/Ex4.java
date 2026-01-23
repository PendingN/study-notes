import java.io.*;
import java.util.*;
public class Ex4{
    private static String[] getFileByExt(String path,String ext){
        File f= new File(path);
        FileFilter ff=new FileFilter(ext);
        return f.list(ff);
    }
    public static void main(String [] args){
        String[] result=getFileByExt(System.getProperty("user.dir"),"java");
        System.out.println(Arrays.toString(result));

        if (checkExist(result)) {
            System.out.println("Ton Tai");
        } else {
            System.out.println("Khong ton tai");
        }


        isFileOrDIR("Ex4.java");
        isFileOrDIR("abc");
        isFileOrDIR(System.getProperty("user.dir"));
    }
    public static boolean checkExist(String[] paths){
        for (String path : paths) {
            File f = new File(path);
            if (f.exists()) {
                return true;
            }
        }
        return false; 
    }
    public static void isFileOrDIR(String path){
        File f = new File(path);
        if(!f.exists()) System.out.println("Khong ton tai");
        else if (f.isFile()) System.out.println("Day laf file");
        else if (f.isDirectory()) System.out.println("Day la folder");
    }
    public String findLongestWord(String path){
        String l="";
        try (BufferedReader br = new BufferedReader(new FileReader(l))){
            String line;
            while((line=br.readLine())!=null){
                String[] words = line.split("\\s+");
                for(String w: words){
                    if(w.length()>l.length()){
                        l=w;
                    }
                }
            }
        }catch(Exception e){
            System.out.println("lol");
        }
    return l;
    }
}