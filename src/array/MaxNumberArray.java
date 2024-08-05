package array;

public class MaxNumberArray {
    public static void main(String[] args)
    {
        // Declare and initialize array

        int[]x={10,21,3,4,78,91,27,66,41,37};
        System.out.println(x.length);

        // Assume first element is maximum
        int max=x[0];

        for (int i = 1; i <x.length ; i++)
        {
            if (x[i]>max)
            {
            max=x[i];
        }

        }
        // Printing max number in array
        System.out.println("Max number in given array is " + max);
    }
}

