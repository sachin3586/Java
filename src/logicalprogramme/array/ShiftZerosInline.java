package logicalprogramme.array;

import java.util.Arrays;


    public class ShiftZerosInline {
        public static void main(String[] args) {
            int[] a = {0, 4, 2, 3, 5, 1, 7, 0, 0, 6};
            int w = 0;
            for (int v : a) {
                if (v != 0) {
                    a[w++] = v;
                }
            }
            while (w < a.length) {
                a[w++] = 0;
            }
            System.out.println(Arrays.toString(a));
        }
    }
