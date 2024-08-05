package array;

import java.util.Arrays;

public class AscendingOrderArray1 {
    public static void main(String[] args) {
        int []num={10,20,30,40,50,54,2,99,89,12,57,32,8,4};
        System.out.println("The length of array is " + num.length);
        Arrays.sort(num);
        System.out.println("Ascending order of given array is as below");

        // using for each loop
        for (int x:num){
            System.out.println(x);
        }
        // using for loop
        for (int i=0;i<num.length;i++){
            System.out.print(num[i] +  " ");
        }
    }
}
