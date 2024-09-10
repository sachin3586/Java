package logicalprogramme.array;

import java.util.Arrays;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int [] x={10,20,30,25,29,41,11,10,20,25,57,98,100,101,57};
        Arrays.sort(x);
        System.out.println("Descending order of array is as below");
        for(int i=x.length-1;i>=0;i--){
            System.out.print(x[i] + " ");


        }
        System.out.println("******************************************");

        //finding duplicates in array
        for (int i=0;i<x.length;i++){
            for (int j=i+1;j<x.length;j++){
                if (x[i]==x[j]){
                    System.out.print( x[i] + " ");
                }
            }
        }
    }


}
