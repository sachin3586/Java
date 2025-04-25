package logicalprogramme.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortListAscendingOder {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("apple");
        al.add("mango");
        al.add("banana");


        Collections.sort(al);
        System.out.println(al.contains("mango"));

        for (String result:al){
            System.out.print(result + " ");
        }
        Iterator iterator=al.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
