package array;

public class SmallestNumberInArray
{
    public static void main(String[] args) {
        //Declare and initialize array

        int[]x={10,20,30,40,50,55,9,34};
        System.out.println("Length of array x is " + x.length);
        // Find minimum number in array x

        int min=x[0];  // assume the first element is minimum

        for (int i = 1; i <x.length ; i++)
        {
            if (x[i]<min)
            {
                min=x[i];  // update min if smaller number is found.
            }
            
        }
        // Print the minimum number
        System.out.println("Minimum number in given array x is " + min);
        
    }
}
