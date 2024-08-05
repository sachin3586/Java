package logicalprogramme.numbers;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter number ");
        int num=s.nextInt();

        if(num%2==0){
            System.out.println("Number is Even and divisible by 2");
        }
        else {
            System.out.println("Number is not even number");
        }

    }
}
