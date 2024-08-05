package array;

import java.util.Arrays;

public class AscendingOrderArray {
    public static void main(String[] args)
    {
        //Declare and initialize array
        int[]x={11,36,54,87,54,24,9,2,1,36,154,78,0,54,29,64};

        // Finding length of array
        System.out.println(x.length);
        Arrays.sort(x);
        // Print the sorted array
        System.out.println("The ascending order array is as below ");

     /*   for (int i = 0; i <x.length ; i++)      
        {
            System.out.print(x[i] + " ");
        }

      */
        for (int y:x)                // using for each loop
        {
            System.out.print(y + " ");
        }

    }
}
