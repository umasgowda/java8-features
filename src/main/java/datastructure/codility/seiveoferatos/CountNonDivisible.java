package datastructure.codility.seiveoferatos;

/**
 * Calculate the number of elements of an array that are not divisors of each element.
 * https://app.codility.com/programmers/lessons/11-sieve_of_eratosthenes/count_non_divisible/
 */
public class CountNonDivisible {


    public static void main(String[] args) {
        int[] A = {3, 1, 2, 3, 6};
        int[] result = solution(A);
        System.out.println(result);
    }

    private static int[] solution(int[] A) {

        //find max number. To be used for 'count sort' array size.
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            max = Math.max(max, A[i]);
        }

        //count sort
        int[] count = new int[max + 1];
        for (int i = 0; i < A.length; i++) {
            count[A[i]]++;
        }

        int[] nonDiv = new int[max + 1];
        //initially count all elements as non divisible (minus 'number of occurrences' of the the given number)
        for (int i = 1; i < nonDiv.length; i++) {
            if (count[i] != 0) {//skip numbers which don't exists in table A
                nonDiv[i] = A.length - count[i];
            }
        }

        //sieve
        for (int i = 1; i < nonDiv.length; i++) {
            if (count[i] != 0) {//skip numbers which don't exists in table A
                int s = i * 2;
                while (s < nonDiv.length) {
                    if (nonDiv[s] != 0) {
                        //Sieve. Most important part. Decrease number of non-divisible by the number of occurrences of number 'i'.
                        nonDiv[s] -= count[i];
                    }
                    s += i;
                }
            }
        }

        //produce the output
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            res[i] = nonDiv[A[i]];
        }

        return res;

    }
}
