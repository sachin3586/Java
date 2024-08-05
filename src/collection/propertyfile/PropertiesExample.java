package collection.propertyfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws IOException {

        FileReader fileReader=new FileReader("C:\\Users\\lenovo\\Desktop\\Testing\\TestingSACHIN.txt");
        Properties properties=new Properties();
        properties.load(fileReader);
        System.out.println(properties);

    }
}
