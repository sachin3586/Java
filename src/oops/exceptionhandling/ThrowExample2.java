package oops.exceptionhandling;

public class ThrowExample2 {
    public static void marriageAge(int age) throws Exception{
        if (age>=18){
            System.out.println("Candidate is eligible for Marriage");
        }
        else {
            throw new Exception("Candidate isn't eligible for Marriage ");
        }

    }

    public static void main(String[] args) throws Exception {
        marriageAge( 15);
    }
}
