package datastructure.codility.greedyAlgorithm;

/**
 * https://app.codility.com/programmers/lessons/16-greedy_algorithms/
 */
public class TieRopes {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 1, 1, 3};
        int K = 4;
        int result = solution(A, K);
        System.out.println(result);
    }

    //Time Complexity O(N)
    private static int solution(int[] A, int K) {
        if (A.length == 1) {
            return A[0] >= K ? 1 : 0;
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
            if (sum >= K) {
                sum = 0;
                count++;
            }
        }
        return count;
    }
}
