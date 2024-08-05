package array;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][]a= new int[3][4];
        a[0][0]=12;
        a[0][1]=9;
        a[0][2]=12;
        a[0][3]=25;
        a[1][0]=14;
        a[1][1]=23;
        a[1][2]=8;
        a[1][3]=19;
        a[2][0]=75;
        a[2][1]=27;
        a[2][2]=27;
        a[2][3]=91;

        System.out.println(a.length);

        for (int i = 0; i <a.length ; i++)
        {
            for (int j = 0; j <4; j++)
            {

                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }
}
