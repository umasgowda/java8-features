package datastructure.codility.leader;

import java.util.HashMap;
import java.util.Map;

/**
 * Dominator
 * Find an index of an array such that its value occurs at more than half of indices in the array.
 * https://app.codility.com/programmers/lessons/8-leader/
 */
public class Dominator {
    public static void main(String[] args) {
        int[] A = {3, 4, 4, 4, 6, -1, 4, 4};

        int result = solution(A);
        System.out.println(result);

    }

    //Time Complexity O(N)
    private static int solution(int[] A) {
        Integer denominator = findLeaderCandidate(A);
        if (denominator == null) {
            return -1;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] == denominator) {
                return i;
            }
        }
        return -1;
    }

    private static Integer findLeaderCandidate(int[] A) {
        int target = A.length / 2;

        Map<Integer, Integer> aMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (aMap.containsKey(A[i])) {
                int countValue = aMap.get(A[i]);
                countValue = countValue + 1;
                aMap.put(A[i], countValue);
            } else {
                aMap.put(A[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : aMap.entrySet()) {
            if (entry.getValue() > target) {
                Integer key = entry.getKey();
                return key;
            }
        }
        return null;
    }
}
