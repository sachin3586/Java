package logicalprogramme.array;

public class RotateArray {
    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  // output is 5 6 7 8 9 10 1 2 3 4
                                                    // o/p is    5 6 7 8 9 10 4 3 2 1

        int startIndex=4;
        for (int i=startIndex;i<x.length;i++){
            System.out.print(x[i] + " ");
        }

       /* for (int i=0;i<startIndex;i++){
            System.out.print(x[i] + " ");
        }

        */

        for (int i=startIndex-1;i>=0;i--){
            System.out.print(x[i] + " ");
        }



    }
}