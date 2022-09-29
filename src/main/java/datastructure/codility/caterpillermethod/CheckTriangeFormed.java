package datastructure.codility.caterpillermethod;

import java.util.Arrays;

/**
 * @author piksel
 */
public class CheckTriangeFormed {
    public static void main(String[] args) {
        int[] A = {10, 2, 5, 1, 8, 12};

        int result = solution(A);
        if (result == 1) {
            System.out.println("Triangle can be formed ");
        } else {
            System.out.println("Triangle can not be formed");
        }
    }

    private static int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 2; i < A.length; i++) {

            int p = A[i - 2];
            int q = A[i - 1];
            int r = A[i];

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
