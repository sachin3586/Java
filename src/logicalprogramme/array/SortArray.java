package logicalprogramme.array;

public class SortArray {
    public static void main(String[] args) {

        int []  x={11,12,45,78,20,41,65,92,24,43,29,37,19,11,77};

        for (int i=0;i<x.length;i++){
            for (int j=0;j<x.length-1;j++){
                if (x[j]>x[j+1]){
                    int temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }
        for (int num:x){
            System.out.print(num + " ");
        }
    }
}
