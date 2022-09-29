package datastructure.codility.arrays;

/**
 * CyclicRotation
 * Rotate an array to the right by a given number of steps.
 * <p>
 * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index,
 * and the last element of the array is moved to the first place.
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
 * <p>
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 * <p>
 * Write a function:
 * <p>
 * class Solution
 * {
 * public int[] solution(int[] A, int K);
 * }
 * <p>
 * that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
 * <p>
 * For example, given
 * <p>
 * A = [3, 8, 9, 7, 6]
 * K = 3
 * the function should return [9, 7, 6, 3, 8]. Three rotations were made:
 * <p>
 * [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
 * [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
 * [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
 * For another example, given
 * <p>
 * A = [0, 0, 0]
 * K = 1
 * the function should return [0, 0, 0]
 * <p>
 * Given
 * <p>
 * A = [1, 2, 3, 4]
 * K = 4
 * the function should return [1, 2, 3, 4]
 * <p>
 * Assume that:
 * <p>
 * N and K are integers within the range [0..100];
 * each element of array A is an integer within the range [−1,000..1,000].
 * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */
public class CyclicRotationOfArray {
    public static void main(String[] args) {

        int[] A = {3, 8, 9, 7, 6};
        int K = 3;

        int[] result = solution(A, K);
        for (int r : result) {
            System.out.print(" " + r);
        }
        System.out.println();

        int[] inputArray = {3, 8, 9, 7, 6};
        int J = 3;
        int[] result2 = solution2(inputArray, J);
        for (int r2 : result2) {
            System.out.print(" " + r2);
        }

    }

    private static int[] solution2(int[] A, int K) {
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[(i + K) % A.length] = A[i];
        }
        return B;
    }

    private static int[] solution(int[] A, int K) {
        int[] rotatedA = new int[A.length];

        for (int i = 0; i < K; i++) {
            rotatedA = rotate(A);
        }
        return rotatedA;
    }

    private static int[] rotate(int[] A) {
        int lastElement = A[A.length - 1];
        for (int i = A.length - 1; i > 0; i--) {
            A[i] = A[i - 1];
        }
        A[0] = lastElement;

        return A;
    }
}
