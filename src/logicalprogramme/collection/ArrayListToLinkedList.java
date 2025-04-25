package logicalprogramme.collection;

import java.util.*;

public class ArrayListToLinkedList {
    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Sachin");
        map.put(2,"Sarika");
        map.put(3,"Shlok");

        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        ArrayList arrayList=new ArrayList<>(map.values());
        System.out.println(arrayList);


    }
}
