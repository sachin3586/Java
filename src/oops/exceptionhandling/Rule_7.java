package oops.exceptionhandling;

public class Rule_7 {
    // Finally block will not be executed if program exit(either by calling System.exit(), or by causing fatal error process to abort)
    // fatal error -ex -- JVM crashed
    public static void main(String[] args) {

        try {
            System.out.println("Try block executes ");
            System.out.println(80/0);

        }
        finally {
            System.exit(10);
            System.out.println("Finally block executes successfully");
        }

    }
}
