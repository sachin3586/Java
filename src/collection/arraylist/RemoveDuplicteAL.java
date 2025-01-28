package collection.arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicteAL {
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(5);
        ar.add(10);
        ar.add(5);ar.add(10);ar.add(20);ar.add(30);ar.add(20);
        System.out.println("Given AL is " + ar);
        System.out.println("Applied Hashset to get only duplicates ");

        HashSet<Integer> uniqueElement=new HashSet<>();
        HashSet<Integer> duplicateElement=new HashSet<>();

        for (Integer i:ar){
            if (!uniqueElement.add(i)){
                duplicateElement.add(i);
            }
        }

        System.out.println("Duplicates element are ");
        System.out.println(duplicateElement);
    }
}
