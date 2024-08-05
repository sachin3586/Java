package logicalprogramme.numbers;

import java.util.Scanner;

public class LeafYear {
    // every four year is leaf year
    // if year is divisible by 4 then it is leaf year

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");

        int year=sc.nextInt();
        if (year%4==0){
            System.out.println("This  is leaf yer");
        }
        else {
            System.out.println("This is not leaf year");
        }
    }
}
