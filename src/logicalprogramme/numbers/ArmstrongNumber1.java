package logicalprogramme.numbers;

import java.util.Scanner;

public class ArmstrongNumber1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int number=scanner.nextInt();
        int temp=number;
        int cubesSum=0;
        while (temp>0){
            int digit = temp % 10;
            int cube=digit*digit*digit;
            System.out.println("Cube of digit " + digit + " is " + cube);

            temp/=10; // remove last digit
            cubesSum +=cube;
            System.out.println("Cubes sum is " + cubesSum);
        }

        scanner.close();
    }
}
