import java.io.*;
public class FileFilter implements FilenameFilter{
    private String ext;
    public FileFilter(String ext){
        this.ext="."+ext;
    }
    @Override
    public boolean accept(File dir,String fName){
        return fName.endsWith(ext);
    }
}