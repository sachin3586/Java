package logicalprogramme.numbers;

import java.util.Scanner;

class ReverseNumber{
    public static void main(String [] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your choice number");
        int number=scanner.nextInt();

        int reverse=0;
        while(number!=0){
            int digit=number%10;
            reverse=reverse*10+digit;
            number=number/10;
        }
        System.out.println("The reverse number is " + reverse);
    }
}