package logicalprogramme.string;

public class StringSplitReverse1 {

    public static void main(String[] args) {
        String original="SHLOK SACHIN DADHE I am Automation ,Manual SDET ENGINEER";
        String[] reverse = original.split(" ");// Split the sentence into words


        for(int i= original.length()-1;i>=0;i--){

            System.out.print(original.charAt(i) );

        }
    }
    }



