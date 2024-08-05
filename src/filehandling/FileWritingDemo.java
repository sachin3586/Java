package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritingDemo {
    public static void main(String[] args) throws IOException {

        // Specify file path of text file
        String filePath="C:\\Users\\lenovo\\Desktop\\Testing\\TestingSACHIN.txt";

        //Create object of FileWriter class

        FileWriter writer=new FileWriter(filePath);

        // write text to file

        writer.write("Hello Everyone SACHIN DADHE THIS SIDE \n");
        writer.write("How are you Guys");

        // close FileWriter
        writer.close();
        System.out.println("Data written in file successfully");

    }
}
