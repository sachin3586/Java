package array;

public class SingleDimensionalArrayExample1 {
    public static void main(String[] args) {
        int []a=new int[6];
        a[0]=11;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=51;
        a[5]=60;

        System.out.println("The length of array is  " + a.length);

        for (int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }

    }
}
