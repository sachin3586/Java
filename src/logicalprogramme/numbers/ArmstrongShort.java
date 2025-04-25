package logicalprogramme.numbers;

import java.util.Scanner;

public class ArmstrongShort {
    public static void main(String[] args) {
        int c=0,a,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        temp=num;

        while (num>0){

            a=num%10;
            num=num/10;
            c=c+(a*a*a);
        }
        if (temp==c){
            System.out.println("Number is armstrong");
        }
        else {
            System.out.println("Number is not armstrong");
        }
    }
}
