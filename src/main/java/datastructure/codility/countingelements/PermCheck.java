package datastructure.codility.countingelements;

import java.util.HashSet;
import java.util.Set;

/**
 * Check whether array A is a permutation.
 * Input: arr[] = {1, 2, 5, 3, 2}
 * Output: No
 * <p>
 * Input: arr[] = {1, 2, 5, 3, 4}
 * Output: Yes
 */
public class PermCheck {

    public static void main(String[] args) {
        int A[] = {1, 2, 5, 3, 4};

        boolean result = solution(A);

        if (result) {
            System.out.println("Permutation Array");
        } else {
            System.out.println("Not Permutation Array");
        }

    }

    private static boolean solution(int[] A) {
        Set<Integer> aSet = new HashSet<>();

        int maxElement = 0;
        for (int i = 0; i < A.length; i++) {
            aSet.add(A[i]);

            maxElement = Math.max(maxElement, A[i]);

        }

        if (maxElement != A.length) {
            return false;
        }

        if (aSet.size() == A.length) {
            return true;
        }

        return false;

    }
}
