package logicalprogramme.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String s = "stress";
        char firstNonRepeatedChar = findFirstNonRepeatedChar(s);

        if (firstNonRepeatedChar != 0) {
            System.out.println("First non-repeated character: " + firstNonRepeatedChar);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }

    public static char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find the first character with count 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0; // Return 0 if no non-repeated character is found
    }
}

