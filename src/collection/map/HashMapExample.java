package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        //Integer --> key && String--> value
        //  Duplicate keys are not allowed, but when we use duplicate key new duplicate key with value replaced by old one
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1 ,"solapur");
        hashMap.put(2,"Pune");
        hashMap.put(3,"Satara");
        hashMap.put(4,"Sangali");
        hashMap.put(5,"Solapur");
        hashMap.put(1,"Latur");

        System.out.println(hashMap);

        Iterator iterator=hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----------------------------------------------");

        for (Map.Entry entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+ " " +entry.getValue());
        }














    }

}
