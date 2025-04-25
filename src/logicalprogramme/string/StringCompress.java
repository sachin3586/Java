package logicalprogramme.string;

import java.util.HashMap;
import java.util.Map;

public class StringCompress {
    public static void main(String[] args) {
        String s1="abbcccddddeeeee";
        String [] s2=s1.split("");

        HashMap<String,Integer> map=new HashMap<>();

        for (String word:s2){
            map.put(word,map.getOrDefault(word,0)+1);

        }

        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+ ":"+entry.getValue());
        }
    }
}
