package array;

public class MinNumberArray {
    public static void main(String[] args) {
        int [] y={2,54,21,87,98,78,23,25,22,18,84,101,36,97,25,41,31,68};
        System.out.println("Length of above array is " + y.length);
        // finding min number in array
        int min=y[0];

        for (int i=1;i<y.length;i++){
            if (y[i]<min){

                min=y[i];
            }
        }
        System.out.println("Min number in array is " + min);
    }
}
