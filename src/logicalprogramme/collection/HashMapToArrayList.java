package logicalprogramme.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapToArrayList {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("Pune" ,"1");
        map.put("Solapur","2");

        for (Map.Entry<String,String> entry:map.entrySet()){

            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        ArrayList<String> city=new ArrayList<>(map.keySet());
        for (String name:city){
            System.out.println(name);
        }

        ArrayList<String> number=new ArrayList<>(map.values());
        for (String num:number){
            System.out.println(num);
        }
    }
}
