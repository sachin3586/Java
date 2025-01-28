package logicalprogramme.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseCharArrayUsingCollections {
    public static void main(String[] args) {
        Character [] ch={'s','a','c','h','i','n'};
        List<Character> charList = Arrays.asList(ch);
        System.out.println(charList);

        System.out.println("Reversed char array is as below");
        Collections.reverse(charList);
        System.out.println(charList);
    }
}
