package logicalprogramme.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseIntArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(40);
        arrayList.add(23);
        arrayList.add(80);

       // Collections.sort(arrayList);
        Collections.reverse(arrayList);

        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
