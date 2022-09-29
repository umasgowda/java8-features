package datastructure.codility.leader;

import java.util.HashMap;
import java.util.Map;

/**
 * https://app.codility.com/programmers/lessons/8-leader/equi_leader/
 * Find the index S such that the leaders of the sequences A[0], A[1], ..., A[S] and A[S + 1], A[S + 2], ..., A[N - 1] are the same.
 */
public class EquiLeader {

    public static void main(String[] args) {

        int[] A = {4, 3, 4, 4, 4, 2};
        int result = solution(A);
        System.out.println(result);

    }

    private static int solution(int[] A) {
        //1. Find the leader of an array A
        Map<Integer, Integer> aMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {

            if (aMap.containsKey(A[i])) {
                int count = aMap.get(A[i]) + 1;
                aMap.put(A[i], count);
            } else {
                aMap.put(A[i], 1);
            }
        }

        //find the max occurances of an element in an array
        int max_count = 1;
        int leaderCandidate = A[0];
        for (int key : aMap.keySet()) {
            int current_count = aMap.get(key);
            if (current_count > max_count) {
                max_count = current_count;
                leaderCandidate = key;
            }
        }

        // check "if there is a leader"
        int leader_Count = 0;
        if (max_count > A.length / 2) {
            leader_Count = max_count;
        } else {
            return 0;
        }

        // 2. scan the whole array again

        int num_Equi_leaders = 0; // number of equi leaders
        int left_Leader_Count = 0; // number of leaders in left side

        // scan the array
        for (int i = 0; i < A.length; i++) {

            // find a leader (in left side)
            if (A[i] == leaderCandidate) {
                left_Leader_Count++;
            }

            // if the leader is "a leader in left side" (more than half)
            if (left_Leader_Count > (0.5) * (i + 1)) {
                // then, check right side
                int right_Leader_Count = leader_Count - left_Leader_Count;
                // if the leader is "a leader in right side" (more than half)
                if (right_Leader_Count > (0.5) * (A.length - i - 1)) {
                    num_Equi_leaders++; // leader in both sides (then, equi leaders++)
                }
            }
        }
        return num_Equi_leaders;
    }


}


