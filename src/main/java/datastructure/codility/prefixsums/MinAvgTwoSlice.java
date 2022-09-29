package datastructure.codility.prefixsums;

/**
 * MinAvgTwoSlice.
 * Find the minimal average of any slice containing at least two elements.
 */
public class MinAvgTwoSlice {

    public static void main(String[] args) {
        int[] A = {4, 2, 2, 5, 1, 5, 8};
        int result = solution(A);
        System.out.println(result);

    }

    private static int solution(int[] A) {
        int minAvgIndex = 0;
        double minAvgValue = A[0] + A[1] / 2;

        double currentAvg = 0;

        //We check first the 2-element slice
        for (int i = 0; i < A.length - 2; i++) {
            currentAvg = ((double) A[i] + A[i + 1]) / 2;
            if (currentAvg < minAvgValue) {
                minAvgValue = currentAvg;
                minAvgIndex = i;
            }
        }
        //We check first the 3-element slice
        for (int i = 0; i < A.length - 2; i++) {
            currentAvg = ((double) A[i] + A[i + 1] + A[i + 2]) / 2;
            if (currentAvg < minAvgValue) {
                minAvgValue = currentAvg;
                minAvgIndex = i;
            }
        }
        /**
         * Now we have to check the remaining two elements of the array
         * Inside the for we checked ALL the three-element slices (the last one
         * began at A.length-3) and all but one two-element slice (the missing
         * one begins at A.length-2).
         */
        currentAvg = ((double) (A[A.length - 2] + A[A.length - 1])) / 2;
        if (currentAvg < minAvgValue) {
            minAvgValue = currentAvg;
            minAvgIndex = A.length - 2;
        }
        return minAvgIndex;
    }
}
