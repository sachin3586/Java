package logicalprogramme.array;

public class

SortArrayWithoutSortFunction {
    public static void main(String[] args) {
        int[] x = {51,47,33,25,15,70};

        // Sort the array using Bubble Sort
        for (int i = 0; i < x.length ; i++) {
            for (int j = 0; j < x.length-1 ; j++) {
                if (x[j] > x[j + 1]) {
                    // Swap x[j] and x[j+1]
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}