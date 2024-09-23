package array;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrderArray {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5,77,111};
        System.out.println("Length of array is " + numbers.length );
        Arrays.sort(numbers);
        System.out.println("Asxending order array is ");
        for (int n:numbers){
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("Descending order Array is ");
        for (int i=numbers.length-1;i>=0;i--){
            System.out.print(numbers[i] + " ");
        }


    }

    }

