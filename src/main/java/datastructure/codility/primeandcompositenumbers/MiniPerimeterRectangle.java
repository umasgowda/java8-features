package datastructure.codility.primeandcompositenumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Find the minimal perimeter of any rectangle whose area equals N.
 * https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/min_perimeter_rectangle/
 */
public class MiniPerimeterRectangle {

    public static void main(String[] args) {
        //int N = 2;
        //int N = 100000000;
        int N = 11;
        //int N = 36;

        int result = solution(N);
        System.out.println("minimal perimeter= " + result);
    }

    //time complexity O(sqrt(N))
    private static int solution(int N) {
        if (N == 0) {
            return N;
        }
        List<Integer> factors = findFactors(N);

        if (factors.size() == 1) {
            return 2 * (1 + N);
        }

        int minPerimeter = Integer.MAX_VALUE;
        for (Integer A : factors) {
            int B = N / A;
            int currentPerimeter = 2 * (A + B);
            minPerimeter = Integer.min(currentPerimeter, minPerimeter);
        }
        return minPerimeter;
    }

    private static List<Integer> findFactors(int N) {
        int limit = (int) Math.sqrt(N);
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= limit; i++) {
            if (N % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
}
