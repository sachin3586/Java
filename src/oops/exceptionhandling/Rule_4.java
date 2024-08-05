package oops.exceptionhandling;

public class Rule_4 {
    // We cant define parent exception at top and child exception at bottom

    public static void main(String[] args) {
        try {
            System.out.println(40/0);
        }
        catch (ArithmeticException a)
        {
            a.printStackTrace();
        }

        catch (Exception e){
            e.printStackTrace();
            System.out.println("Parent exception handled at bottom");
        }

    }
}
