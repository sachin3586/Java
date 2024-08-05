package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("C:\\Users\\lenovo\\Desktop\\Testing\\TestingSACHIN.txt");

        int i;
        while ((i= fileReader.read())!=-1){
            System.out.print(i); // Printing  ASCII values

            // for char value
            System.out.print((char)i);


        }
        fileReader.close();

    }


}
