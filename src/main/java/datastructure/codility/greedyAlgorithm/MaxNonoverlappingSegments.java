package datastructure.codility.greedyAlgorithm;

/**
 * https://app.codility.com/programmers/lessons/16-greedy_algorithms/max_nonoverlapping_segments/
 */
public class MaxNonoverlappingSegments {

    public static void main(String[] args) {

        int[] A = {1, 3, 7, 9, 9};
        int[] B = {5, 6, 8, 9, 10};
        int result = solution(A, B);
        System.out.println(result);

    }

    private static int solution(int A[], int B[]) {
        int N = A.length;
        //if N <= 1, we know the answer already.
        if (N <= 1) {
            return N;
        }

        int count = 1;
        int previous_end = B[0];

        for (int i = 1; i < N; i++) {
            if (A[i] > previous_end) {
                count++;
                previous_end = B[i];
            }
        }
        return count;

    }
}
