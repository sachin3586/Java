package oops.exceptionhandling;

public class Rule_5 {
    // We can define try block without catch block but we must need to use finally block
    // Important code printed in finally block
    //It is used as to put "Cleanup code " such as closing file , closing connection etc.
    public static void main(String[] args) {
        int []x=new int[4];
        System.out.println("The length of array is is " + x.length);
        try {
            System.out.println(x[5]);
        }
       /* catch (ArrayIndexOutOfBoundsException a)
        {
            a.printStackTrace();
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }

        */
        finally {
            System.out.println("Finally block executes");
        }
    }
}
