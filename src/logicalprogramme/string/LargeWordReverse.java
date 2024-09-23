package logicalprogramme.string;

public class LargeWordReverse {
    public static void main(String[] args) {
        String s1="My name is Sachin I am SDET Engineer";
        String [] words=s1.split(" ");
        String largestWord="";
      /* for (int i=0;i<words.length;i++){
           if (words[i].length()>largestWord.length()){
               largestWord=words[i];
           }
       }
       */

        for (String word:words){
            if (word.length()>largestWord.length()){
                largestWord=word;
            }
        }
        System.out.println("Largest word is " + largestWord);

       StringBuffer sb=new StringBuffer(largestWord);
        StringBuffer reverseWord = sb.reverse();

        System.out.println("Reversed largest word is " +  reverseWord);
    }
}
