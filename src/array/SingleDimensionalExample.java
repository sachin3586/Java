package array;

public class SingleDimensionalExample {
    public static void main(String[] args) {

        int[]num=new int[5];
        num[0]=50;
        num[1]=11;
        num[2]=80;
        num[3]=41;
        num[4]=29;
        System.out.println("The length of above array is " + num.length);
        for (int i = 0; i <num.length ; i++)
        {
            System.out.print(num[i] + " ");
        }
    }
}
