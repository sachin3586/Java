package string;

import java.util.Scanner;

public class ScannerForInt {
    public static void addition(int a, int b,int c){
        System.out.println("The addition of two number is " + (a+b+c));
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int no1=scanner.nextInt();
        System.out.println("Enter second number");
        int no2= scanner.nextInt();
        System.out.println("Enter third number");
        int no3=scanner.nextInt();


        ScannerForInt.addition(no1,no2,no3);
    }
}
