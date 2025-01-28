package logicalprogramme.numbers;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");

       long x = scanner.nextInt();

        long factorial = 1;
        for (long i = x; i >= 1; i--) {

            factorial = factorial * i;


        }

        System.out.println(factorial);
    }
}
