package datastructure.codility.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Distinct
 * Compute number of distinct values in an array.
 * Write a function
 * class Solution { public int solution(int[] A); }
 * that, given an array A consisting of N integers, returns the number of distinct values in array A.
 * For example, given array A consisting of six elements such that:
 * A[0] = 2    A[1] = 1    A[2] = 1
 * A[3] = 2    A[4] = 3    A[5] = 1
 * the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class Distinct {


    public static void main(String[] args) {
        int[] A = {2, 1, 1, 2, 3, 1};
        int result = solution1(A);
        System.out.println(result);

        int result2= solution2(A);
        System.out.println(result2);
    }

    //Time complexity O(NlogN)
    private static int solution1(int[] A) {
        return (int) Arrays.stream(A).distinct().count();
    }

    //time complexity of O(N)
    private static int solution2(int[] A) {
        Set<Integer> aSet = new HashSet<>();
        for (int arrayElement : A) {
            aSet.add(arrayElement);
        }
        return aSet.size();
    }
}
