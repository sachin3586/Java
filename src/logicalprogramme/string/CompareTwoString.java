package logicalprogramme.string;

import java.util.Scanner;

public class CompareTwoString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter first string ");
        String s1=sc.nextLine();

        System.out.println(" Enter second string ");
        String s2=sc.nextLine();

        if (s1.compareTo(s2)==0){
            System.out.println("Both strings are equal");
        }

        else {
            System.out.println("Both strings are not equal ");
        }

    }
}
