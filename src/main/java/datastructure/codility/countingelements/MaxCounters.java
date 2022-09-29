package datastructure.codility.countingelements;

/**
 * MaxCounters
 * Calculate the values of counters after applying all alternating operations: increase counter by 1; set value of all counters to current maximum.
 * You are given N counters, initially set to 0, and you have two possible operations on them:
 * <p>
 * increase(X) − counter X is increased by 1,
 * max counter − all counters are set to the maximum value of any counter.
 * A non-empty array A of M integers is given. This array represents consecutive operations:
 * <p>
 * if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
 * if A[K] = N + 1 then operation K is max counter.
 * For example, given integer N = 5 and array A such that:
 * <p>
 * A[0] = 3
 * A[1] = 4
 * A[2] = 4
 * A[3] = 6
 * A[4] = 1
 * A[5] = 4
 * A[6] = 4
 * the values of the counters after each consecutive operation will be:
 * <p>
 * (0, 0, 1, 0, 0)
 * (0, 0, 1, 1, 0)
 * (0, 0, 1, 2, 0)
 * (2, 2, 2, 2, 2)
 * (3, 2, 2, 2, 2)
 * (3, 2, 2, 3, 2)
 * (3, 2, 2, 4, 2)
 * The goal is to calculate the value of every counter after all operations.
 */
public class MaxCounters {

    public static void main(String[] args) {

        int A[] = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;
        int[] result = solution(N, A);
        for(int rElemet: result) {
            System.out.print(" " + rElemet);
        }
    }

    //Time Complexity O(N + M)
    private static int[] solution(int N, int[] A) {
        int[] count = new int[N];
        int max = 0;
        int lastUpdate = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                if (count[A[i] - 1] < lastUpdate) {
                    count[A[i] - 1] = lastUpdate + 1;
                } else {
                    count[A[i] - 1]++;
                }
                max = Math.max(max, count[A[i] - 1]);
            } else {
                lastUpdate = max;
            }
        }
        for (int i = 0; i < N; i++) {
            if (count[i] < lastUpdate)
                count[i] = lastUpdate;
        }
        return count;
    }

}
