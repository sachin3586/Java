package methods;

import java.util.Scanner;

public class ScannerClass1 {
    public void addition(int a,int b, int c){
        System.out.println("Addition is " + (a+b+c));
    }

    public static void main(String[] args) {
        ScannerClass1 scannerClass1=new ScannerClass1(); // create instance of ScannerClass1

        // use scanner class for run time input data
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=scanner.nextInt();
        System.out.println("Enter second number");
        int b=scanner.nextInt();
        System.out.println("Enter third number");
        int c=scanner.nextInt();
        scannerClass1.addition(a,b,c);



    }
}
