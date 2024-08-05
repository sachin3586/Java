package array;

public class MultiDimensionalArray {
    public static void main(String[] args)
    {
        // Declare and initialize array
        int[][]num= {
                {10, 20, 30, 40},
                {25, 14, 98, 87},
                {69, 74, 58, 49} };
        // Tracing array for printing

        for (int i = 0; i < num.length ; i++)       // For rows in array
        {
            for (int j = 0; j <num[i].length ; j++)       // OR j< 4 i.e length of array  // for columns in array
            {
                System.out.print(num[i][j]  + " ");     // printing first row
            }
            System.out.println();       // keep cursor on next line
        }

    }
}
