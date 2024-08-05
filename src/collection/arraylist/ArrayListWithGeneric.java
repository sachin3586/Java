package collection.arraylist;

import java.util.ArrayList;  //  Array list insertion order is maintained
import java.util.Collections;

public class ArrayListWithGeneric {
    public static void main(String[] args) {        // Generic allow only Homogeneous data in arraylist
        ArrayList<Integer> arrayList=new ArrayList<>();  // Initial capacity 10
        ArrayList<String> arrayList3=new ArrayList<>();

        arrayList.add(500);
        arrayList.add(200);
        arrayList.add(100);
        arrayList.add(67);
        arrayList.add(198);
        arrayList.add(927);
        System.out.println(arrayList);
        System.out.println("The size of arrayList is " + arrayList.size());

        Collections.sort(arrayList);   // Return data in Ascending order
        //After Collections class sort method
        System.out.println("After Collections class sort method");
        System.out.println(arrayList);

      /* for (Object o:arrayList){
           System.out.println(o);

        }

       */

    }
}
