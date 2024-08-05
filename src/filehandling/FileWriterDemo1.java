package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {
        // create object of file writer class & provide file path
        FileWriter writer=new FileWriter("C:\\Users\\lenovo\\Desktop\\Testing\\TestingSACHIN.txt");

        // write data in file
        writer.write("Hello Everyone my name is Sachin ");
        writer.write("I am an SDET engineer");

        // close writer
        writer.close();
        System.out.println("File written  & closed successfully");
    }


}
