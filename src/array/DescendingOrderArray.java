package array;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrderArray {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5,77,111};
        System.out.println("Length of array is " + numbers.length );

        // Convert to Integer array for sorting
        Integer[] integerArray = Arrays.stream(numbers).boxed().toArray(Integer[]::new);

        // Sort in descending order
        Arrays.sort(integerArray, Collections.reverseOrder());

        // Print the sorted array
        System.out.println(Arrays.toString(integerArray));


    }

    }

