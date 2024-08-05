package oops.exceptionhandling;

public class ThrowExample {
    public static void voting(int age){
        if (age>=18){
            System.out.println("Candidate is eligible for voting");
        }
        else {
            throw new RuntimeException("Candidate isn't eligible for voting ");
        }
        System.out.println("Exception handled");
    }

    public static void main(String[] args) {
        voting(17);
    }
}
