package collection.arraylist;

import java.util.Iterator;
import java.util.Vector;

public class VectorListExample {
    // Vector is a legacy class of Array List
    // It is synchronized, low performance, and thread safe,
    //Rest of all same to Array list

    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("Hi Everyone");
        vector.add("I am SACHIN");
        System.out.println(vector);

        for (Object obj:vector){                    // 1) using for each loop
            System.out.print(obj + " ");
        }
        System.out.println();

        for (int i=0;i<vector.size();i++){          // 2) using simple for loop
            System.out.print(vector.get(i) + " ");
        }
        System.out.println();

        Iterator<String> itr = vector.iterator();  // 3) printing VL using iterator
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
