package logicalprogramme.string;

public class LargeWordReverse {
    public static void main(String[] args) {
        String s1="I am Trader Investor and trainer";
        String [] s2=s1.split(" ");
        String largeWord="";

        for (String word:s2){
            if(word.length()>largeWord.length()){
                largeWord=word;
            }
        }
        System.out.println("Largestword is " + largeWord);

        StringBuffer sb=new StringBuffer(largeWord);
        StringBuffer reverseWord = sb.reverse();
        String wordR = reverseWord.toString();

        System.out.println(wordR);
    }
}
