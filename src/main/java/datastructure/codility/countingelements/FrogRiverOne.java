package datastructure.codility.countingelements;

import java.util.HashSet;
import java.util.Set;

/**
 * FrogRiverOne
 * Find the earliest time when a frog can jump to the other side of a river.
 */
public class FrogRiverOne {

    public static void main(String[] args) {
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        //1,2, 3,4,5
        int X = 5;

        int result1 = solution(X, A);
        System.out.println("solution=" + result1);
    }

    private static int solution(int X, int[] A) {
        Set<Integer> leaves = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            leaves.add(A[i]);

            if (leaves.contains(X) && leaves.size() == X) {
                return i;
            }
        }

        return -1;
    }
}


