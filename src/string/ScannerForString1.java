package string;

import java.util.Scanner;

public class ScannerForString1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String name1 = sc.nextLine();
        System.out.println("Enter second string");
        String name2 = sc.nextLine();
        String name3 = name1.concat(name2);
        System.out.println(name1+ " " + name2);
        System.out.println(name3);

    }
}
