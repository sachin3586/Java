package logicalprogramme.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayUsingCollections {

    public static void main(String[] args) {

        Integer [] num={10,20,45,21,9,7,3,2};

        // convert array to list
        List<Integer> numlist= Arrays.asList(num);

        // reverse the list

        Collections.reverse(numlist);
        // print array list only

        System.out.println(numlist);
 // getting one by one element using for each loop

        for (Integer n:numlist){
            System.out.println(n);
        }
    }
}
