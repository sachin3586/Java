package collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollectionClass {
    public static void main(String[] args) {  // AL is suitable for frequent retrieval operation
        // Insertion order is maintained, Duplicates are allowed , Multiple null insertion is possible,
        //Allow heterogeneous data, for homogeneous data use generic with data type like <>

        ArrayList<Integer> arrayList3=new ArrayList<>();

        arrayList3.add(500);
        arrayList3.add(200);
        arrayList3.add(100);
        arrayList3.add(67);
        arrayList3.add(198);
        arrayList3.add(927);
        arrayList3.add(620);
        System.out.println(arrayList3);
        System.out.println("The size of arrayList is " + arrayList3.size());

        Collections.sort(arrayList3);  // Return data in Ascending order
        System.out.println("After using Collection class sort method " +arrayList3);

        Collections.sort(arrayList3,Collections.reverseOrder());   // VIMP

        // This Collection Class method return data in Descending order
        System.out.println("After sort & reverseOrder method " + arrayList3);













    }

}
