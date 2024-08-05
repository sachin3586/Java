package array;

public class MultiDimensionalArray1 {
    public static void main(String[] args) {

        int [][]x={ // declare and initialization array
                {1,2,3,4,5},      // each single dimensional array represent one row i.e here 2 rows and 5
                {6,7,8,9,10}
        };

        for (int i=0; i<x.length;i++){

            for (int j=0 ; j<x[i].length; j++) {

                System.out.print(x[i][j] +  " ");      //printing first row
            }
            System.out.println();

        }
    }
}
