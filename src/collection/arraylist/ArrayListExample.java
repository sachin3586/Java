package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();  // Initial capacity 10 , Providing dynamic array data structure

        arrayList.add("SACHIN");
        arrayList.add("DADHE");
        arrayList.add(251);
        arrayList.add(50.21f);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add("SACHIN");

        System.out.println(arrayList);   // get arraylist data in array form
       /* for (Object o:arrayList){        // get arraylist data one by one not in array form

            System.out.println(o);

        }
        */                    // Iterator is a parent interface of collection
        // Using Iterator interface method

        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){     // hasNext() method return true if element is present
            System.out.println(iterator.next());         // next method is used to get next element
        }

    }
}

