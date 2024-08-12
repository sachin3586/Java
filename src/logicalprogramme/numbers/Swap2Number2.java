package logicalprogramme.numbers;

import java.util.Scanner;

public class Swap2Number2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
       int a= sc.nextInt();
        System.out.println("Enter second number");
       int b=sc.nextInt();
        System.out.println("Number before swapping are  a = " + a + " and b =  " + b );
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping  a="+ a + " and b= " +b);
    }
}
