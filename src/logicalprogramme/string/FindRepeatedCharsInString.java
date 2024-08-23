package logicalprogramme.string;

import java.util.Scanner;

public class FindRepeatedCharsInString {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter string");
       String s= sc.nextLine();

       int counter=0;
       for (int i=0;i<s.length();i++){
           if (s.charAt(i)==' '){
               counter++;
           }
       }

        System.out.println(counter);

    }
}
