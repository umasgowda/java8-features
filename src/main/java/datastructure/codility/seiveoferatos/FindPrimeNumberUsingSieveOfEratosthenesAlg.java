package datastructure.codility.seiveoferatos;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a number n, print all primes smaller than or equal to n using Sieve Of Eratosthenes Algorithm.
 * The Sieve of Eratosthenes is one of the most efficient ways to find all primes smaller than N when N is smaller than 10 million or so.
 */
public class FindPrimeNumberUsingSieveOfEratosthenesAlg {

    public static void main(String[] args) {

        int N = 46000;
        List<Integer> result = printPrimeNumberEratoshanas(N);
        System.out.println(result);

    }

    //Sieve of Eratosthenes(SOE) - time complexity - O(logN(log N)
    //It will work only for numbers upto 46000
    private static List<Integer> printPrimeNumberEratoshanas(int N) {
        // initially assume all integers are prime
        boolean[] isPrimeNumber = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrimeNumber[i] = true;
        }

        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            if (isPrimeNumber[i]) {
                primes.add(i);
                // now mark the multiple of i as non-prime number
                for (int j = i; j * i <= N; j++) {
                    isPrimeNumber[i * j] = false;
                }
            }

        }
        return primes;
    }



}
