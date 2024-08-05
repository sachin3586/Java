package logicalprogramme.numbers;

import java.util.Arrays;

public class SecondLargestNumberInArray {

    public static void main(String[] args) {
        int [] x={5,3,8,3,13,9,18,51,1,0,};

        Arrays.sort(x);

        System.out.println(Arrays.toString(x));


        System.out.println("Largest number is " + x[x.length-1]);
            System.out.println("second largest number is " + x[x.length-2]);
        System.out.println("Smallest number is " + x[0]);

        }
    }



