package logicalprogramme;

public class CapitalWordsInString {

    public static void main(String[] args) {

        String s="Hello Everyone My Name Is Sachin ";

        int counter=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)>='A' && s.charAt(i)<='Z'){

                counter++;

            }

        }
        System.out.println(counter);

    }
}
