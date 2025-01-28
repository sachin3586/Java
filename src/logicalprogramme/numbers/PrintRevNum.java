package logicalprogramme.numbers;

import java.util.Scanner;

public class PrintRevNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int num=scanner.nextInt();

        StringBuilder stringBuilder=new StringBuilder(Integer.toString(num));
        stringBuilder.reverse();
        int revNum = Integer.parseInt(stringBuilder.toString());
        System.out.println("Reverse number is  " + revNum );

        if (num==revNum){
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }
    }

}
