package datastructure.codility.primeandcompositenumbers;

/**
 * Count factors of given number n.
 * <p>
 * https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/count_factors/
 */
public class CountFactors {

    public static void main(String[] args) {

        int N = 24;
        int result = solution(N);
        System.out.println("factorsCount=" + result);

    }

    //time complexity: O(sqrt(N))
    private static int solution(int N) {
        int countFactors = 0;
        int limit = (int) Math.sqrt(N);
        for (int i = 1; i <= limit; i++) {
            if (N % i == 0 && i * i != N) {
                countFactors += 2;
            } else if (i * i == N) {
                countFactors++;
            }
        }
        return countFactors;
    }
}
