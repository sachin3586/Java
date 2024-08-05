package oops.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        //Checked exception -It is exception which is checked by compiler
        try {
            FileReader fileReader=new FileReader("C:\\Users\\lenovo\\Desktop\\TestingJava_Notes");
            System.out.println("Executing checked exception");
        }
        catch (FileNotFoundException f)
        {
            f.printStackTrace();
            System.out.println("Checked exception executes ");
        }
    }
}
