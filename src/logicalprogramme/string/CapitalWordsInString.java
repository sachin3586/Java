package logicalprogramme.string;

public class CapitalWordsInString {

    public static void main(String[] args) {

        String s="Hello Everyone My Name Is Sachin ";

        int counter=0;
        for (int i=0;i<=s.length()-1;i++){
            if (s.charAt(i)>='A' && s.charAt(i)<='Z'){

                counter++;
                System.out.print(s.charAt(i) + " ");

            }

        }
        System.out.println(counter);

    }
}
