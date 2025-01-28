package logicalprogramme.array;

public class ArrayExp {
    public static void main(String[] args) {

        int [] x={10,5,13,21,47,98,2,22,54,73,31,81,61,11,29,67,101,200};
        System.out.println("Length of array is " + x.length);
        int max=x[0];
        for (int i=1;i<x.length;i++){

            if (x[i]<max){

                max=x[i];
            }
        }
        System.out.println(max);
    }
}
