package logicalprogramme.numbers;

import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int x=scanner.nextInt();

        boolean isPrime=true;
        if (x<=1){
            isPrime=false;
        }
        else {
            for (int i=2;i<=x-1;i++){
                if (x%i==0){
                    isPrime=false;

                    break;
                }
            }
        }

        System.out.println(x + (isPrime ? " is a prime number" : " is not a prime number"));    }

}
