package collection.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable=new Hashtable<>();
        hashtable.put(1,"Alibag Beach");
        hashtable.put(2,"Divegar Beach");
        hashtable.put(3,"Malvan Beach");
        hashtable.put(4,"Dapoli Beach");
      //  hashtable.put(5,null);
        System.out.println(hashtable);
        System.out.println("=====================================================");
        Iterator iterator=hashtable.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("======================================================");
        for (Map.Entry entry:hashtable.entrySet()){
            System.out.println(entry.getKey() +  " " + entry.getValue() );
        }
    }
}
