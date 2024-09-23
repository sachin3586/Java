package logicalprogramme;

import java.util.Scanner;

public class RepeatedWordsInStingParagraph {
    public static void main(String[] args) {

        int counter=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter paragraph");
        String para = scanner.nextLine();

        String [] str=para.split(" ");
        for (int i=0;i<str.length;i++){

            for (int j=i+1;j<str.length;j++){
                if (str[i].equals(str[j])){
                    counter++;
                }
            }

        }
        System.out.println(counter);






    }

}
