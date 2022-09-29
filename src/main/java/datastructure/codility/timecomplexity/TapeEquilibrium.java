package datastructure.codility.timecomplexity;

/**
 * @author piksel
 */
public class TapeEquilibrium {

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4, 3};
        int result = solution(A);
        System.out.println(result);
    }

    /*Time Complexity: O(N)
     Space Complexity: O(1) */
    private static int solution(int[] A) {
        int sumLeft = A[0];
        int sumRight = 0;
        for (int i = 1; i < A.length; i++) {
            sumRight = sumRight + A[i];
        }
        int difference = Math.abs(sumLeft - sumRight);

        for (int i = 0; i < A.length - 1; i++) {
            sumLeft += A[i];
            sumRight -= A[i];
            int tempDifference = Math.abs(sumLeft - sumRight);
            if (tempDifference < difference) {
                difference = tempDifference;
            }
        }

        return difference;
    }
}
