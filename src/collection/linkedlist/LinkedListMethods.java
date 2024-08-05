package collection.linkedlist;

import java.util.LinkedList;

public class LinkedListMethods {
    // All methods are same like array list ,add on below methods are supported
    //addFirst(), addLast(), getFirst(), getLast(), removeFirst(), removeLast().
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("DADHE");
        linkedList.add(387);
        linkedList.add(null);
        linkedList.add("SHLOK");
        System.out.println("Linked list before applying add on methods " + linkedList);
        System.out.println();
        System.out.println("Linked list after applying add on methods");
        linkedList.addFirst("SACHIN");
        linkedList.addLast("DADHE");
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(4));
        System.out.println(linkedList);
        linkedList.getLast();
        System.out.println(linkedList.getFirst());

        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);

    }
}
