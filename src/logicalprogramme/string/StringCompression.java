package logicalprogramme.string;

import java.util.HashMap;

public class StringCompression {
    public static void main(String[] args) {
        String s = "abbcccddddeeeeee";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : map.keySet()) {
            sb.append(ch).append(map.get(ch));
        }

        System.out.println(sb.toString()); // Output: a2b3c4
    }
}
