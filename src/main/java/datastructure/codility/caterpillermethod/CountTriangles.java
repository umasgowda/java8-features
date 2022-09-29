package datastructure.codility.caterpillermethod;

import java.util.Arrays;

/**
 * CountTriangles
 * Count the number of triangles that can be built from a given set of edges.
 * https://app.codility.com/programmers/lessons/15-caterpillar_method/count_triangles/
 * <p>
 * Example:
 * A = {4, 6, 3, 7}
 * output = 3
 * There are three triangles possible {3, 4, 6}, {4, 6, 7} and {3, 6, 7}.
 * Note that {3, 4, 7} is not a possible triangle.
 */
public class CountTriangles {


    public static void main(String[] args) {
        int[] A = {10, 2, 5, 1, 8, 12};

        int result = solution(A);
        System.out.println(result);
    }

    //time complexity: O(N**2)
    private static int solution(int[] A) {
        int n = A.length;
        Arrays.sort(A);

        int count = 0;

        for (int i = 0; i < n - 2; ++i) {
            int k = i + 2;
            for (int j = i + 1; j < n; ++j) {
                while (k < n && A[i] + A[j] > A[k]) {
                    ++k;
                }
                if (k > j)
                    count += k - j - 1;
            }
        }
        return count;

    }

}
