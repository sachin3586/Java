package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\lenovo\\Desktop\\CloneFolder\\FileDemo1");
        File f1=new File("C:\\Users\\lenovo\\Desktop\\CloneFolder\\filef1");

        file.createNewFile();
        f1.createNewFile();

        System.out.println(file.getName());
        System.out.println(file.isDirectory());
        System.out.println(file.isAbsolute());
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.getPath());
        System.out.println(f1.delete());
    }

}
