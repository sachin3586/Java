package logicalprogramme.array;

import java.util.*;

public class ArrayReverseIMP {

    public static void main(String[] args) {


        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer []y=new Integer[x.length];

        for (int i=0;i<x.length;i++){
            y[i]=x[i];

        }
        List<Integer> l = Arrays.asList(y);
        System.out.println(l);
    }
}


