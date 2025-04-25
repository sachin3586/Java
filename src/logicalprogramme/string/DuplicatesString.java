package logicalprogramme.string;

import java.util.HashSet;
import java.util.Iterator;

public class DuplicatesString {

    public static void main(String[] args) {

        // find duplicates in string
        String s1="My My name name is is sachin dadhe";
        String [] s2=s1.split(" ");

        HashSet<String> uniqueWords=new HashSet<>();
        HashSet<String> duplicatesWords=new HashSet<>();

        for (String word:s2){
            if (!uniqueWords.add(word)){
                duplicatesWords.add(word);
            }
        }

        // getting hashset elements
        Iterator iterator=duplicatesWords.iterator(); // using iterator
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // using for each loop
        for (String result:duplicatesWords){
            System.out.print(result + " ");
        }
    }
}
