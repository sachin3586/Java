package oops.encapsulation;

public class EncapsulationExample {


    public static void main(String[] args) {

        ReadOnlyClass readOnlyClass=new ReadOnlyClass();  // For read only create instance of class & accessing methods

      /*  System.out.println(readOnlyClass.getX());
        System.out.println();
        System.out.println(readOnlyClass.getName());


       */

        //In write only method first we write then we get data as like below

        WriteOnlyClass writeOnlyClass=new WriteOnlyClass();  // Created instance of class

        writeOnlyClass.setName("I am Automation QA"); // Setting/writing value
        writeOnlyClass.setX(301);
        System.out.println(writeOnlyClass.getName());   // After setting value then we get value using getter method
        System.out.println(writeOnlyClass.getX());




    }


    }

