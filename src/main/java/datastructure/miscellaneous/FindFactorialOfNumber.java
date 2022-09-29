package datastructure.miscellaneous;

public class FindFactorialOfNumber {

    // Example : factorial of 4 = 4*3*2*1 = 24

    public static void main(String[] args) {

        System.out.println("factorial using recursion " + factorialUsingRecursion(4));
        System.out.println("factorial using iterative " + factorialUsingIterative1(4));
    }

    private static int factorialUsingIterative1(int n) {
        int result = 1;
        while (n > 0) {
            result = result * n;
            n--;
        }
        return result;
    }

    //Example: 5! = 1**2*3*4*5
    private static void factorialUsingIterative2(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial using iterative " + factorial);
    }

    private static int factorialUsingRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialUsingRecursion(n - 1);
    }

}
