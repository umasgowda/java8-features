package datastructure.codility.seiveoferatos;

import java.util.ArrayList;
import java.util.List;

/**
 * Count the semiprime numbers in the given range [a..b]
 * A semiprime is a natural number that is the product of two (not necessarily distinct) prime numbers.
 * https://app.codility.com/programmers/lessons/11-sieve_of_eratosthenes/count_semiprimes/
 */
public class CountSemiPrimes {


    public static void main(String[] args) {
        int N = 26;
        int[] P = {1, 4, 16};
        int[] Q = {26, 10, 20};

        int[] primeNumbers = solution(N, P, Q);
    }

    private static int[] solution(int N, int[] P, int[] Q) {

        int[] semiPrime = new int[N];

        List<Integer> primeNumbers = findPrimeNumbers(N);
        System.out.println(primeNumbers);

        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < Q.length; j++) {
                if (i == j && P[i] < Q[j]) {


                }

            }

        }


        return semiPrime;

    }

    private static List<Integer> findPrimeNumbers(int N) {
        List<Integer> primeNumbers = new ArrayList<>();
        if (N == 1) {
            primeNumbers.add(N);
        }
        int countFactors = 0;
        for (int i = 2; i <= (int) Math.sqrt(N); i++) {
            if (N % i == 0) {
                countFactors+=2;
            } else {
                countFactors++;
            }

            if(countFactors <2) {
                primeNumbers.add(i);
            }

        }
        return primeNumbers;
    }

    private static void isSemiPrimeNumber(int start, int end) {

        for (int k = start; k <= end; k++) {

            if (k % 2 == 0) {

            }

        }
    }


}
