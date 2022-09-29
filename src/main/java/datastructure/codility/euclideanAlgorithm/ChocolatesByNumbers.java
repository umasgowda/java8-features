package datastructure.codility.euclideanAlgorithm;

/**
 * ChocolatesByNumbers
 * There are N chocolates in a circle. Count the number of chocolates you will eat.
 * <p>
 * https://app.codility.com/programmers/lessons/12-euclidean_algorithm/chocolates_by_numbers/
 */
public class ChocolatesByNumbers {

    public static void main(String[] args) {
        int N = 10;
        int M = 4;

        int result = solution(N, M);
        System.out.println(result);
    }

    private static int solution(int N, int M) {
        if (M == 1) {
            return N;
        }
        if (M == N) {
            return 1;
        }
        return (N / gcd(N, M));
    }

    //Get the Greatest Common Divisor using Euclidean Algorithm a = b *q + r
    //time complexity O(log(N + M))
    private static int gcd(int a, int b) {
        int r = a % b;

        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }

        return b;

    }
}
