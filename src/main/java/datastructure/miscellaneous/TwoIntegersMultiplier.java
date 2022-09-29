package datastructure.miscellaneous;

import java.math.BigInteger;

/**
 * Multiplier – take two numbers and multiply without using a multiply * operator.
 */
public class TwoIntegersMultiplier {

    public int getProductUsingMathFunction(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public BigInteger getProductUsingBigInteger(int a, int b) {
        BigInteger x = new BigInteger(String.valueOf(a));
        BigInteger y = new BigInteger(String.valueOf(b));
        return x.multiply(y);
    }

    public int getProductUsingIterative(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        a = (a < 0) ? -a : a;
        b = (b < 0) ? -b : b;
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = result + a;
        }
        return (a < 0 || b < 0) ? -result : result;
    }

    public int getProductUsingRecursion(int input1, int input2) {
        int result = multiply(input1, Math.abs(input2));
        return input2 < 0 ? -result : result;
    }

    private int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        if (a == 1) {
            return b;
        }
        if (b == 1) {
            return a;
        }
        return a + multiply(a, b - 1);
    }

}
