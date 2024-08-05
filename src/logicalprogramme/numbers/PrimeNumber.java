package logicalprogramme.numbers;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();

        boolean isPrime=true;

        if (num<=1){
            isPrime=false;
        }
        else {
            for (int i=2;i<=num-1;i++){
                if (num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }

       System.out.println(num + (isPrime ? " is a prime number" : " is not a prime number"));
       // System.out.println(num);
    }
}
