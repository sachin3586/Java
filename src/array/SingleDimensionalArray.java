package array;

public class SingleDimensionalArray
{
    public static void main(String[] args) {
         int[]x={10,15,20,25,87,51,52,98};

       // System.out.println(x.length);
        //Access and print elements in  array

        for (int i = 0; i <x.length ; i++) // this is method to sort given array without using
                                           // inbuilt sort function
        {
           for (int j=0;j<x.length-1;j++){
               if (x[j]==x[j+1]){
                   int temp=x[j];
                   x[j]=x[j+1];
                   x[j+1]=temp;
               }
           }
        }

        for (int i=0;i<x.length;i++){
            System.out.print(x[i] + " ");
        }
    }
}
