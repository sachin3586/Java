package collection.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {
    // Duplicates are allowed, insertion order is preserved, multiple null insertion allow,heterogeneous data allow
    // best option where frequent operation is insertion, delete on middle
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add("SHLOK");
        linkedList.add("SACHIN");
        linkedList.add(500);
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add("SHLOK");

        System.out.println(linkedList);
    }
}
