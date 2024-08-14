package logicalprogramme.numbers;

import java.util.Scanner;

public class Swap2Number2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum=sc.nextInt();
        System.out.println("Enter second number");
        int secondNum=sc.nextInt();
        System.out.println("Befor swapping numbers are firstNum is " + firstNum + " and secondNum is " + secondNum);

        firstNum=firstNum+secondNum;
        secondNum=firstNum-secondNum;
        firstNum=firstNum-secondNum;
        System.out.println("After swapping numbers are firstNumber is  "  + firstNum + " secondNum is " + secondNum);

    }
}
