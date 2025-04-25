package logicalprogramme.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateString {
    public static void main(String[] args) {

        String s1="Hello Hello everyone my my name  name is is SACHIN SACHIN";
        String [] words=s1.split(" ");
        HashSet<String> uniqueWords=new HashSet<>();
        HashSet<String> duplicatesWords=new HashSet<>();



        for (String word:words){
           if (!uniqueWords.add(word)){
               duplicatesWords.add(word);
           }
        }

        for (String result:duplicatesWords){   // printing hashset using for each loop
            System.out.print(result + " ");
        }

        System.out.println();

        Iterator<String> iterator = uniqueWords.iterator(); // printing hashset using Iterator

        while (iterator.hasNext()){

            System.out.print(iterator.next() + " ");
        }

    }


}
