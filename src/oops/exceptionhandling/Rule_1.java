package oops.exceptionhandling;

public class Rule_1 {
    //When we don't know which exception we will get , we use parent class exception
    //i.e. Exception class we have to use

    public static void main(String[] args) {
        String s=null;
        try{
            System.out.println(s.length());
        }
        catch(Exception e ){
            e.printStackTrace();
            System.out.println("Exception handled");

        }
    }
}
