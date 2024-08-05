package array;

public class SingleDimensionalArray1 {
    public static void main(String[] args) {
        int []x={10,20,15,3,45,84};

        System.out.println("Length of given array is " + x.length);
        // access and print element in array

        for (int i=0;i<=x.length-1;i++) // array length starts from 1 and array index starts from 0 hence use length-1
        {                                // else we can use i<length as well instead
            System.out.print(x[i] + " ");
        }
    }
}
