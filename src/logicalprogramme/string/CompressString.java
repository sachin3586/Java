package logicalprogramme.string;

import java.util.HashMap;

public class CompressString {
    public static void main(String[] args) {
         String s="abbcccdddd";

        HashMap<Character,Integer> map=new HashMap<>();

        for (char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder stringBuilder=new StringBuilder();

        for (char ch:map.keySet()){
            stringBuilder.append(ch).append(map.get(ch));
        }
        System.out.println(stringBuilder.toString());

    }
}
