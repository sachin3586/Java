package logicalprogramme.string;

import java.util.HashMap;
import java.util.Map;

public class OccuranceWord {
    public static void main(String[] args) {
        String s1="Sachin Dadhe wafale from pune is is is isi siiiiii";
        String [] s2=s1.toLowerCase().split(" ");
        HashMap<String,Integer> map=new HashMap<>();

        for (String word:s2){
            if (!word.isEmpty()){
                map.put(word,map.getOrDefault(word,0)+1);
            }
        }

        for (Map.Entry<String,Integer>entry:map.entrySet()){

            System.out.println(entry.getKey()+":"+entry.getValue());

        }










    }
}
