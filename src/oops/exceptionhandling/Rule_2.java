package oops.exceptionhandling;

public class Rule_2 {
    // We cant use catch block alone , if we try we will get compile time error
    public static void main(String[] args) {

        try {
            System.out.println(10/0);
        }


        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception handled");
        }
    }
}
