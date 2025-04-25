package logicalprogramme.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShiftZeros {
    public static void main(String[] args) {

        int[] x= {0, 4, 2, 3, 5, 1, 7, 0, 0, 6};
        int w=0;

        for (int v:x){

            if (v!=0){
                x[w++]=v;
            }

        }
        while (w<x.length){
            x[w++]=0;
        }
        System.out.println(Arrays.toString(x));
    }
}
