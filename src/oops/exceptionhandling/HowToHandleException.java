package oops.exceptionhandling;

public class HowToHandleException {
    public static void main(String[] args) {

        System.out.println("Good Morning to All This side Sachin Here");
        // Unchecked exception which is not checked by compiler

        try {
            System.out.println(50/0);
        }
      /*  catch (ArithmeticException a){
            a.printStackTrace();
        }/
         // If we know the exception we can declare but if we dont know exception then we can use parent class exception
       */

        catch (Exception a)
        {
            a.printStackTrace();
        }

        System.out.println("I have 5 years of experience  as a QA");
    }
}
