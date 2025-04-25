package logicalprogramme.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class ElementPartOfCollection {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Sachin");
        arrayList.add("Dadhe");
        arrayList.add("Wafale");

        System.out.println(arrayList.contains("Sachin"));
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"Pune");
        map.put(2,"Solapur");

        boolean result = map.containsKey(2);
        System.out.println(result);
        System.out.println(map.containsValue("Pune"));
    }
}
