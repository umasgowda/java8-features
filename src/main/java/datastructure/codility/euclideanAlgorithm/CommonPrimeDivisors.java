package datastructure.codility.euclideanAlgorithm;

/**
 * Check whether two numbers have the same prime divisors.
 * https://app.codility.com/programmers/lessons/12-euclidean_algorithm/common_prime_divisors/
 */
public class CommonPrimeDivisors {

    public static void main(String[] args) {
        int[] A = {15, 10, 3};
        int[] B = {75, 30, 5};

        int result = solution(A, B);
        System.out.println(result);
    }

    //time complexity: O(Z * log(max(A) + max(B))**2)
    private static int solution(int[] A, int[] B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            int b = B[i];
            if (hasCommonPrimeDivisors(a, b)) {
                count++;
            }
        }
        return count;
    }

    //If two numbers have the same prime divisors then the gcd of both numbers and the result of each number divided by gcd must have the same prime divisors too.
    private static boolean hasCommonPrimeDivisors(int a, int b) {
        if (a == b) {
            return true;
        }
        if (a == 1 || b == 1) {
            return false;
        }

        int gcdValue = findGCD(a, b);

        while (a != 1) {
            int gcdA = findGCD(a, gcdValue);
            if (gcdA == 1) {
                break;
            }
            a = a / gcdA;
        }

        if (a != 1) {
            return false;
        }

        while (b != 1) {
            int gcdB = findGCD(b, gcdValue);
            if (gcdB == 1) {
                break;
            }
            b = b / gcdB;
        }
        return b == 1;
    }

    private static int findGCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
}
