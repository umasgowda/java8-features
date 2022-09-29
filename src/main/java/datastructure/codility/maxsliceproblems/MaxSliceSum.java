package datastructure.codility.maxsliceproblems;

/**
 * MaxSliceSum
 * Find a maximum sum of a compact subsequence of array elements.
 * https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_slice_sum/
 */
public class MaxSliceSum {
    public static void main(String[] args) {
        int[] A = {-2, 1};
        int result = solution(A);
        System.out.println(result);
    }

    private static int solution(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int maxGlobalSum = Integer.MIN_VALUE;

        int maxCurrentSum = 0;
        for (int i = 0; i < A.length; i++) {
            maxCurrentSum = Integer.max(A[i], A[i] + maxCurrentSum);
            maxGlobalSum = Math.max(maxGlobalSum, maxCurrentSum);
        }

        return maxGlobalSum;
    }
}
