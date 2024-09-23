package logicalprogramme.numbers;

import java.util.Scanner;

public class PrintNumberRevrese2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();

        System.out.println("The number is " + a);

        int reverse=0;
        while (a!=0){
            int digit=a%10;
            reverse=reverse*10+digit;

            a=a/10;
        }

        System.out.println("The reverse number is " + reverse);
    }
}
