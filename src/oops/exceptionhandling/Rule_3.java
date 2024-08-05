package oops.exceptionhandling;

public class Rule_3 {
    // We have single try block and multiple catch block
    public static void main(String[] args) {

        try {
            System.out.println(50/0);
        }
        catch (ArithmeticException a){
            System.out.println("Arithmetic Exception handled");
            a.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException handled ");
            e.printStackTrace();
        }
    }
}
