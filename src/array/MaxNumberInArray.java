package array;

import java.util.Arrays;

public class MaxNumberInArray {
    public static void main(String[] args) {
        int []num={10,23,54,78,21,45,3,64,91,22,17,9,84,29,51,21,38,47};
        System.out.println("The length of array is " + num.length);
        int max=num[0];
        for (int i=0;i<num.length;i++){
            if (num[i]<max){
                max=num[i];
            }
        }
        System.out.println("Maximum number in array is " + max);
    }
}
