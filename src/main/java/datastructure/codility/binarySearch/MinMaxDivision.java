package datastructure.codility.binarySearch;

/**
 * @author piksel
 */
public class MinMaxDivision {

    public static void main(String[] args) {

        int[] A = {2, 1, 5, 1, 2, 2, 2};
        int K = 3;
        int M = 5;

        int result = solution(K, M, A);
        System.out.println(result);
    }

    private static int solution(int K, int M, int[] A) {
        return binarySearch(K, M, A);
    }

    private static int binarySearch(int K, int M, int[] A) {
        int high = sum(A); //The upper boundary (high) is 15, which is the sum of all the elements in the array.
        int low = max(A); //the lower boundary (low) is the maximum value in the array.

        if (K == 1) return high;
        if (K >= A.length) return low;

        if (low <= high) {
            int mid = (high + low) / 2;
            if (isBlockSizeValid(A, K, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private static boolean isBlockSizeValid(int[] A, int K, int mid) {
        int current = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (current + A[i] > mid) {
                current = A[i];
                count += 1;
            } else {
                current += A[i];
            }
        }

        if (count >= K) {
            return false;
        }
        return true;
    }

    private static int max(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            max = Integer.max(max, A[i]);
        }
        return max;
    }

    private static int sum(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        return sum;
    }
}
