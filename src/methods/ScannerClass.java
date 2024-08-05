package methods;

import java.util.Scanner;

public class ScannerClass {
    public void addition (int a , int b, int c){    // method with parameter

        System.out.println("Addition is "+ (a+b+c));
    }

    public static void main(String[] args) {
        ScannerClass scannerClass=new ScannerClass(); // create the object of class
        // create object of scanner class for giving run time output

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first number");
        int a= scanner.nextInt();
        System.out.println("Please enter second number");
        int b= scanner.nextInt();
        System.out.println("Please enter third number");
        int c= scanner.nextInt();
        scannerClass.addition(a, b,c);



    }
}
