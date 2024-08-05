package array;

import java.util.Arrays;

public class MaxNumberInArray {
    public static void main(String[] args) {
        int []num={10,23,54,78,21,45,3,64,91,22,17,9,84,29,51,21,38,47};
        System.out.println("Length of above num array is " + num.length);

        //For rearranging above int array in ascending order
        Arrays.sort(num);

        System.out.println("Max number in above array is " + num[17]);
        System.out.println( "Min number in above array is " + num[0]);
    }
}
