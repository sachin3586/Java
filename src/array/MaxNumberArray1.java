package array;

public class MaxNumberArray1 {
    public static void main(String[] args) {
        int [] a={5,3,2,11,54,21,87,98,78,23,25,22,18,84,101,36,97,25,41,31,68};

        System.out.println("The length of given array is " + a.length);

        int max=a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Max number in above array is " + max);
    }

}
