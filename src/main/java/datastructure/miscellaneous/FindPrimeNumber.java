package datastructure.miscellaneous;

/**
 * Prime Number is
 * 1. Natural Number > 1
 * 2. Which has only 2 factors -  1 and itself. Meaning number should be divisible by 1 and itself
 * Examples: 2, 3, 5, 7, 11, 13, 17....
 */

public class FindPrimeNumber {

    //if the number is divided by 1 or itself is prime number
    public static void main(String[] args) {
        int input = 8;
        checkPrime(input);
        //  checkPrime1(input);
    }

    private static void checkPrime1(int input) {
        boolean isPrime = true;

        if (input == 0 || input == 1) {
            System.out.println(input + " is not prime number");
        } else {
            for (int i = 2; i <= input / 2; i++) {
                if (input % 2 == 0) {
                    System.out.println(input + " is not a prime number");
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(input + " is prime number");
        }
    }


    //another logic to find the given number is prime or not
    private static void checkPrime(int number) {
        int count = 0;

        if (number == 0 || number == 1) {
            System.out.println(number + " not a prime number");
        } else {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count > 2) {
                System.out.println(number + "not a prime number");
            } else {
                System.out.println(number + " a primer number ");
            }
        }
    }


}
