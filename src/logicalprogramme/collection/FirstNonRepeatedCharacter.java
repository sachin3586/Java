package logicalprogramme.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {

        String s="selenium";
        Map<Character,Integer> map=new LinkedHashMap<>();

        for (char c:s.toCharArray()){

            map.put(c,map.getOrDefault(c,0)+1);


        }

        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }


        }
    }

