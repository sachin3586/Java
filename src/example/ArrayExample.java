package example;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {

        int [] x={10,20,15,11,5,54,10,20,54,54};
        Arrays.sort(x);
        for (int i=x.length-1;i>=0;i--){
            System.out.print(x[i] + " ");

        }
        System.out.println("Duplicates in Arrays are as below ");
        for (int i=0;i<x.length;i++){
            for (int j=i+1;j<x.length;j++){
                if (x[i]==x[j]){
                    System.out.print(x[i] + " ");
                }
            }
        }
    }


}
