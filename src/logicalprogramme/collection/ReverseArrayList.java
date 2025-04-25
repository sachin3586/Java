package logicalprogramme.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseArrayList {
    public static void main(String[] args) {

        ArrayList<String> al=new ArrayList<>();
        al.add("Sachin");
        al.add("Shlok");
        al.add("Sarika");
        al.add("Wafale");

       // Collections.reverse(al);
        Collections.sort(al);

        Iterator iterator=al.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
