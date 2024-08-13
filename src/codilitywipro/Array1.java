package codilitywipro;

class Solution {
    public int solution(int[] A) {
        int n = A.length;


        for (int i = 0; i < n; i++) {
            if (A[i] <= 0 || A[i] > n) {
                A[i] = n + 1;
            }
        }


        for (int i = 0; i < n; i++) {
            int num = Math.abs(A[i]);
            if (num <= n) {
                A[num - 1] = -Math.abs(A[num - 1]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (A[i] > 0) {
                return i + 1;
            }
        }


        return n + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();


        int[] A1 = {1, 3, 6, 4, 1, 2};
        int[] A2 = {1, 2, 3};
        int[] A3 = {-1, -3};
        int[] A4 = {2, 3, 7, 6, 8, -1, -10, 15};


        System.out.println(" First Case : " + solution.solution(A1));
        System.out.println(" Second Test : " + solution.solution(A2));
        System.out.println("Third Case 3: " + solution.solution(A3));
        System.out.println("Fourth Case 4: " + solution.solution(A4));

    }
}
