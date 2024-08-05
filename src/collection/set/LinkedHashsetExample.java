package collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashsetExample {

    public static void main(String[] args) {
        // LinkedHashset and HashSet both are similar ,HashSet uses Hashtable to store element
        // where as LinkedHashset uses Hashtable and doubly link list to store and maintain insertion order.

        LinkedHashSet linkedHashSet= new LinkedHashSet();
        linkedHashSet.add("SACHIN");
        linkedHashSet.add("SHLOK");
        linkedHashSet.add(3586);
        linkedHashSet.add("SARIKA");

        System.out.println(linkedHashSet);
        Iterator iterator=linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        for (Object o:linkedHashSet){
            System.out.println(o);
        }


    }
}
