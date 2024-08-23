package logicalprogramme.string;

public class LargestWordReverseString {
    public static void main(String[] args) {

        String s="My name is Shlok and I am ISRO Junior scientist";
        System.out.println("Given string is = " + s);
        String [] words=s.split(" ");

        // initialize largest words
        String largestWord = "";
        // find largest words in string
        for (String word:words){
            if (word.length()>largestWord.length()){
                largestWord=word;
            }
        }
        // reverse largest word using for loop
        String reverserLargestWord="";
        for (int i=largestWord.length()-1;i>=0;i--){
            reverserLargestWord=reverserLargestWord+largestWord.charAt(i);
        }

        System.out.println("Reversed largest word is " + reverserLargestWord);
    }
}
