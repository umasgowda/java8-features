package datastructure.codility.caterpillermethod;

import java.util.HashSet;
import java.util.Set;

/**
 * Compute number of distinct absolute values of sorted array elements.
 */
public class AbsDistinct {

    public static void main(String[] args) {
        int[] A = {-5, -3, -1, 0, 3, 6};

        int result = solution(A);
        System.out.println(result);
    }

    //Time complexity O(N) or O(N*log(N))
    //Space complexity O(1)
    private static int solution(int[] A) {
        Set<Integer> aSet = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            aSet.add(Math.abs(A[i]));
        }
        return aSet.size();
    }
}
