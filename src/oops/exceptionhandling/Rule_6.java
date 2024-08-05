package oops.exceptionhandling;

public class Rule_6 {
    // For each try block there is zero OR multiple catch block but only one finally block
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
        finally {
            System.out.println("Finally block executes");
        }
      /*  finally{
            System.out.println("Can't use multiple finally block else we get compile time error");
        }

       */
    }
}
