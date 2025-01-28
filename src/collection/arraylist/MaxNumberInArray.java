package collection.arraylist;

public class MaxNumberInArray {
    public static void main(String[] args) {

        int [] num={5,10,15,45,7832,12,45,21,10,38,9011,27,9,7,2605,1991,2009};


        for (int i=0;i<num.length;i++){
            for (int j=0;j<num.length-1;j++){
                if (num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }

            }

        }
// print sorted array
        for (int i=0;i<num.length;i++){
            System.out.print(num[i] + " ");
        }

    }
}
