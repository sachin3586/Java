package string;

import java.util.Scanner;

public class ScannerForStringInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string ");
        String name1= sc.nextLine();     // nextLine(); this method allow to take  next string
        System.out.println("Enter second string"); // next(); allow only single string in once ,space tab  consider
                                                   // second  string and we will get output immediately
        String name2=sc.nextLine();

        System.out.println(name1+ " " + name2);
    }
}
