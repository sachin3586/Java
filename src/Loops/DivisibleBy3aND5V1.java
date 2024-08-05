package Loops;

public class DivisibleBy3aND5V1 {
    public static void main(String[] args) {
        for (int i=1;i <=30;i++){

            if (i%5==0 && i%10==0){
                System.out.println(i + " Number is divisible by 5 and 10");
            }
            else if (i%5==0) {
                System.out.println(i + " Number is divisible by 5");

            }
            else if (i%10==0) {
                System.out.println(i + " Number is divisible by 10");

            }
            else {
                System.out.println( i + " Number is neither divisible by 5 nor by 10");
            }

        }
    }
}
