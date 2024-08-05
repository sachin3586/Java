package string;

import java.util.Scanner;

public class ScannerInt1 {
    public static void addition(int a,int b)
    {
        System.out.println("Addition is " + (a+b));
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=scanner.nextInt();
        System.out.println("Enter second number");
       int c= scanner.nextInt();
       addition(a,c);
    }
}
