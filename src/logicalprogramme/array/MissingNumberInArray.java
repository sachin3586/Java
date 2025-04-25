package logicalprogramme.array;

public class MissingNumberInArray {
    public static void main(String[] args) {

        int [] x={1,2,3,4,5,6,8,9,10};
        int sum1=0;
        for (int i=0;i<x.length;i++){

            sum1=sum1+x[i];
        }
        int sum2=0;

        for (int i=1;i<=10;i++){

            sum2=sum2+i;
        }
        System.out.println("Missing number is " + (sum2-sum1));
    }
}
