package datastructure.codility.sorting;

import java.util.Arrays;

/**
 * Triangle
 * https://app.codility.com/programmers/lessons/6-sorting/triangle/
 */
public class Triangle {

    public static void main(String[] args) {
        int[] A = {10, 2, 5, 1, 8, 20};
        int result = solution(A);
        System.out.println(result);
    }

    //Time Complexity O(N*log(N))
    private static int solution(int[] A) {
        if (A.length < 3)
            return 0;

        Arrays.sort(A);

        for (int i = 2; i < A.length; i++) {
            long p = A[i - 2];
            long q = A[i - 1];
            long r = A[i];

            if (p + q <= r) {
                continue;
            }
            if (r + p <= q) {
                continue;
            }
            if (q + r <= p) {
                continue;
            }
            return 1;
        }

        return 0;
    }
}

