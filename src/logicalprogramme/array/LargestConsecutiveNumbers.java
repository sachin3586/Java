package logicalprogramme.array;

public class LargestConsecutiveNumbers {
    public static void main(String[] args) {

        int [] x={1,2,3,4,5,7,10};
        int maxCount=0;  int currentCount=0;

        for (int i=1;i<x.length;i++){

            if (x[i]==x[i-1]+1){
                currentCount++;
            }
            else {

                currentCount=1;
            }
            maxCount=Math.max(maxCount,currentCount);
        }
        System.out.println(maxCount + " ");
    }
}
