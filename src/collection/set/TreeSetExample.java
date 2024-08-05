package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet treeSet=new TreeSet();
        treeSet.add("RAM");
        treeSet.add("Shyam");
        treeSet.add("Feku");
        treeSet.add("RAM");
       // treeSet.add(25);         // Heterogeneous objects are not allowed we get run time ClassCast Exception
        System.out.println(treeSet);

        Iterator iterator=treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
