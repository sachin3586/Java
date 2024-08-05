package patterns;

import java.util.Scanner;

public class PrintStarsEqualToRows {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter row number");
        int rows=s.nextInt();

        for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
