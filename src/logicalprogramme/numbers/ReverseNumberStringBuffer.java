package logicalprogramme.numbers;

import java.util.Scanner;

public class ReverseNumberStringBuffer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice number");
        int number=sc.nextInt();

        StringBuffer sb=new StringBuffer(Integer.toString(number));
        sb.reverse();
        System.out.println(sb);
        int reverseNumber = Integer.parseInt(sb.toString());
        System.out.println(reverseNumber);
    }
}
