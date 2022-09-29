package datastructure.codility.caterpillermethod;

import java.util.Arrays;

/**
 * 1. Find A pair in array having the minimal absolute value of a sum.
 * 2. Find the minimal absolute value of a sum of two elements.
 */
public class MinAbsSumOfTwo {

    public static void main(String[] args) {
        // int[] A = {1, 4, -3};
        int[] A = {-8, 4, 5, -10, 3};

        int absMinimumSum = solutionToFindAbsMinimumSum(A);
        System.out.println("AbsMinimumSum " + absMinimumSum);
    }

    //time complexity O(N * log(N))
    private static int solutionToFindAbsMinimumSum(int[] A) {
        Arrays.sort(A);
        int low = 0;
        int high = A.length - 1;
        int minAbsSum = Math.abs(A[low] + A[high]);

        while (low <= high) {
            int currentSum = A[low] + A[high];
            minAbsSum = Math.min(minAbsSum, Math.abs(currentSum));
            if (currentSum <= 0)
                low++;
            else
                high--;  // If the sum has become positive, we should know that the high can be moved left
        }
        return minAbsSum;
    }

    private static void findPairOfAbsMinmumSum(int[] A) {
        Arrays.sort(A);
        int low = 0;
        int high = A.length - 1;
        int min = Integer.MAX_VALUE;
        int i = 0, j = 0;
        while (low < high) {
            int currentSum = A[high] + A[low];
            if (Math.abs(currentSum) < min) {
                min = currentSum;
                i = low;
                j = high;
            }
            if (min == 0) {
                break;
            }
            if (currentSum < 0) {
                low++;
            } else {
                high--;
            }
        }
        // print the pair
        System.out.println("Pair found (" + A[i] + ", " + A[j] + ")" + "minmum sum " + min);

    }

}
