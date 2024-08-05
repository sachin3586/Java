package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    // Duplicates not allowed, Insertion order not maintained, null allow but only once, heterogeneous support
    //Suitable for frequent search operation

    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add("SARIKA");
        hashSet.add("Sachin");
        hashSet.add(25.29f);
        hashSet.add(90);
        hashSet.add(90);
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);

      /*  Iterator iterator= hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

       */
        for (Object o:hashSet){
            System.out.println(o);

        }
    }
}
