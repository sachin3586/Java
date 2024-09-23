package logicalprogramme;

import java.util.HashMap;

public class StringCompression {
    public static void main(String[] args) {
        String input = "aabbbcccc";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : map.keySet()) {
            sb.append(c).append(map.get(c));
        }

        System.out.println(sb.toString()); // Output: a2b3c4
    }
}
