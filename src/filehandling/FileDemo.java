package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        File file=new File("C:\\Users\\lenovo\\Desktop\\Testing\\TestingSACHIN");
        File f=new File("C:\\Users\\lenovo\\Desktop\\Testing\\Demo123");
        file.createNewFile();
        f.createNewFile();
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isAbsolute());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.isFile());

        System.out.println(f.delete());
        System.out.println(f.getName());

    }
}
