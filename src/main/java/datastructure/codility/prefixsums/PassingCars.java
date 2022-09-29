package datastructure.codility.prefixsums;

/**
 * PassingCars
 * Count the number of passing cars on the road.
 */
public class PassingCars {
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1};
        int result = solution1(A);
        System.out.println(result);

    }

    //Brute force method - time complexity O(n2)
    private static int solution(int[] A) {

        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i] < A[j] && i < j) {
                    count++;
                    System.out.println("i, j=" + i + "," + j);
                }
            }
        }
        return count;
    }

    //time complexity O(N)
    private static int solution1(int[] A) {
        int countOfZeros = 0, count = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) countOfZeros++;
            if (A[i] == 1) count += countOfZeros;
            if (count > 1000000000) return -1;
        }
        return count;
    }
}
