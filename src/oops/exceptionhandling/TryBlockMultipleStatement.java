package oops.exceptionhandling;

public class TryBlockMultipleStatement {
    // If we have multiple statement in try block then code will terminate at exception line rest statement will not be executes
    public static void main(String[] args) {
        try {
            System.out.println("Hello Good Morning");
            System.out.println(100/0);
            System.out.println("Very very Good Morning");

        }
        catch (ArithmeticException z){
            z.printStackTrace();
            System.out.println("Try block terminates at second statement at which exception got");
        }
    }
}
