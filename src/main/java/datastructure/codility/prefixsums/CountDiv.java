package datastructure.codility.prefixsums;

/**
 * Compute number of integers divisible by k in range [a..b].
 * Example 1:
 * For A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
 * Example 2:
 * For A=10, B=10 and K=2, your function should return 2
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * A and B are integers within the range [0..2,000,000,000];
 * K is an integer within the range [1..2,000,000,000];
 * A ≤ B.
 */
public class CountDiv {

    public static void main(String[] args) {
        int A = 11, B = 345, K = 17;
        // int A = 0, B = 0, K = 2;
        //int A = 6, B = 11, K = 2;
        int result = solution(A, B, K);
        System.out.println(result);
    }

    /**
     * B/K will give you the total numbers divisible by K [1..B]
     * A/K will give you the total numbers divisible by K [1..A]
     * then subtract, this will give you the total numbers divisible by K [A..B]
     * check A%K == 0, if true, then + 1 to the count
     */

    //Time complexity O(1)
    private static int solution(int A, int B, int K) {
        int count = B / K - A / K;
        if (A % K == 0) {
            count++;
        }
        return count;
    }
}
