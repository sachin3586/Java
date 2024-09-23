package logicalprogramme.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayUsingCollection1 {
    public static void main(String[] args) {
        Integer [] x={5,3,8,3,13,9,18,51,1,0,};
        List<Integer> numbers = Arrays.asList(x);

        Collections.reverse(numbers);

        System.out.println(numbers);
        for (Integer n:numbers){
            System.out.print(n + " ");
        }
    }
}
