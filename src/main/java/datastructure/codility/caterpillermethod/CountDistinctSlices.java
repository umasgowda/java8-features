package datastructure.codility.caterpillermethod;

/**
 * CountDistinctSlices
 * Count the number of distinct slices (containing only unique numbers).
 */
public class CountDistinctSlices {


    public static void main(String[] args) {
        int[] A = {3, 4, 5, 5, 2};
        int M = 6;

        int result = solution(M, A);
        System.out.println(result);
    }

    // Time Complexity O(N)
    private static int solution(int M, int[] A) {
        // main idea: use "boolean[]" to record if an integer is already seen
        // also use "leftEnd" and "rightEnd"

        boolean[] seen = new boolean[M + 1]; // from 0 to M

        int leftEnd = 0;
        int rightEnd = 0;
        int numSlice = 0;

        // key point: move the "leftEnd" and "rightEnd" of a slice
        while (leftEnd < A.length && rightEnd < A.length) {

            // case 1: distinct (rightEnd)
            if (seen[A[rightEnd]] == false) {
                // there could be (rightEnd - leftEnd + 1) combinations (be careful)
                numSlice = numSlice + (rightEnd - leftEnd + 1);
                if (numSlice >= 1_000_000_000)
                    return 1_000_000_000;

                // increase the slice to right by "1" (important)
                seen[A[rightEnd]] = true;
                rightEnd++;
            }
            // case 2: not distinct
            else {
                // decrease the slice from left by "1" (important)
                // remove A[leftEnd] from "seen" (be careful)
                seen[A[leftEnd]] = false;
                leftEnd++;
            }
        }

        return numSlice;
    }
}
