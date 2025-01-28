package collection.propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:/Users/lenovo/Desktop/Testing/TestingSACHIN.txt");
        Properties properties=new Properties();
        properties.load(fis);

        System.out.println(properties);
    }
}
