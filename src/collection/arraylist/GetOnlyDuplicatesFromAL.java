package collection.arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class GetOnlyDuplicatesFromAL {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Apple");
        al.add("Pineapple");
        al.add("Apple");
        al.add("Banana");
        al.add("Anjir");
        al.add("Almomds");
        al.add("Banana");

        System.out.println(al);
        //Hashset to store unique element
        HashSet<String> uniqueElements=new HashSet<>();
        //Hashset to store duplicates
        HashSet<String> duplicates=new HashSet<>();
        //Iterate through list
        for (String element:al){
            if (!uniqueElements.add(element)){
                duplicates.add(element);
            }
        }

        System.out.println("Duplicates elements are " + duplicates);

    }
}
