package datastructure.codility.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * OddOccurrencesInArray
 * Find value that occurs in odd number of elements.
 *
 * For example, given array A such that:
 *
 *   A[0] = 9  A[1] = 3  A[2] = 9
 *   A[3] = 3  A[4] = 9  A[5] = 7
 *   A[6] = 9
 * the function should return 7
 *
 */
public class OddOccuranceInArray {

    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9};

        int result = solution(A);
        System.out.println(result);
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    private static int solution(int A[]) {
        int ret = 0;

        for (int i = 0; i < A.length; ++i) {
            ret = ret ^ A[i];
        }

        return ret;
    }

    public static int solution1(int[] A) {
        int count = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (countMap.containsKey(A[i])) {
                countMap.put(A[i], count + 1);
            } else {
                countMap.put(A[i], count);
            }
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 0) {
               return entry.getKey();
            }
        }
        return 0;
    }
}
