package datastructure.miscellaneous;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * @author piksel
 */
@RunWith(MockitoJUnitRunner.class)
public class TwoIntegersMultiplierTest {


    @InjectMocks
    private TwoIntegersMultiplier twoIntegersMultiplier;


    //Using Iterative
    @Test
    public void testGetProductUsingIterativeWhenBothNumbersArePositive() {
        int result = twoIntegersMultiplier.getProductUsingIterative(5, 6);
        assertEquals(result, 30);
    }

    @Test
    public void testGetProductUsingIterativeWhenBothNumbersAreNegative() {
        int result = twoIntegersMultiplier.getProductUsingRecursion(-5, -6);
        assertEquals(result, 30);
    }

    @Test
    public void testGetProductUsingIterativeWhenFirstNumberIsNegative() {
        int result = twoIntegersMultiplier.getProductUsingRecursion(-5, 6);
        assertEquals(result, -30);
    }

    @Test
    public void testGetProductUsingIterativeWhenSecondNumberIsNegative() {
        int result = twoIntegersMultiplier.getProductUsingRecursion(5, -6);
        assertEquals(result, -30);
    }

    @Test
    public void testGetProductUsingIterativeWhenFirstNumberIsZero() {
        int result = twoIntegersMultiplier.getProductUsingRecursion(0, 6);
        assertEquals(result, 0);
    }

    @Test
    public void testGetProductUsingIterativeWhenSecondNumberIsZero() {
        int result = twoIntegersMultiplier.getProductUsingRecursion(5, 0);
        assertEquals(result, 0);
    }

    @Test
    public void testGetProductUsingIterativeWhenFirstNumberIsOne() {
        int result = twoIntegersMultiplier.getProductUsingRecursion(1, 5);
        assertEquals(result, 5);
    }


    //Using recursion
    @Test
    public void testGetProductUsingRecursionWhenBothNumbersArePositive() {
        int result = twoIntegersMultiplier.getProductUsingRecursion(5, 6);
        assertEquals(result, 30);
    }

    @Test
    public void testGetProductUsingRecursionWhenBothNumbersAreNegative() {
        int result = twoIntegersMultiplier.getProductUsingRecursion(-5, -6);
        assertEquals(result, 30);
    }

    @Test
    public void testGetProductUsingRecursionWhenFirstNumberIsNegative() {
        int result = twoIntegersMultiplier.getProductUsingRecursion(-5, 6);
        assertEquals(result, -30);
    }

    @Test
    public void testGetProductUsingRecursionWhenSecondNumberIsNegative() {
        int result = twoIntegersMultiplier.getProductUsingRecursion(5, -6);
        assertEquals(result, -30);
    }

    @Test
    public void testGetProductUsingRecursionWhenFirstNumberIsZero() {
        int result = twoIntegersMultiplier.getProductUsingRecursion(0, 6);
        assertEquals(result, 0);
    }

    @Test
    public void testGetProductUsingRecursionWhenSecondNumberIsZero() {
        int result = twoIntegersMultiplier.getProductUsingRecursion(5, 0);
        assertEquals(result, 0);
    }

    @Test
    public void testGetProductUsingRecursionWhenFirstNumberIsOne() {
        int result = twoIntegersMultiplier.getProductUsingRecursion(1, 5);
        assertEquals(result, 5);
    }

    //Using Math function
    @Test
    public void testGetProductUsingMathWhenGiven2NumbersArePositive() {
        int result = twoIntegersMultiplier.getProductUsingMathFunction(5, 6);
        assertEquals(result, 30);
    }

    @Test
    public void testGetProductUsingMathWhenOneNumberOfTheNumberIsNegative() {
        int result = twoIntegersMultiplier.getProductUsingMathFunction(5, -6);
        assertEquals(result, -30);
    }

    @Test
    public void testGetProductUsingMathWhenBothTheNumbersAreNegative() {
        int result = twoIntegersMultiplier.getProductUsingMathFunction(-5, -6);
        assertEquals(result, 30);
    }

    @Test
    public void testGetProductUsingMathWhenOneOfTheNumberIsZero() {
        int result = twoIntegersMultiplier.getProductUsingMathFunction(0, 6);
        assertEquals(result, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetProductUsingMathWhenNumberIsBiggerThanInteger() {
        twoIntegersMultiplier.getProductUsingMathFunction(123456789, 567892234);
    }

    //Using BigInteger
    @Test
    public void testGetProductUsingBigIntegerWhenGiven2NumbersArePositive() {
        BigInteger result = twoIntegersMultiplier.getProductUsingBigInteger(5, 6);
        assertEquals(result.intValue(), 30);
    }

    @Test
    public void testGetProductUsingBigIntegerWhenOneNumberOfTheNumberIsNegative() {
        BigInteger result = twoIntegersMultiplier.getProductUsingBigInteger(5, -6);
        assertEquals(result.intValue(), -30);
    }

    @Test
    public void testGetProductUsingBigIntegerWhenBothTheNumbersAreNegative() {
        BigInteger result = twoIntegersMultiplier.getProductUsingBigInteger(-5, -6);
        assertEquals(result.intValue(), 30);
    }

    @Test
    public void testGetProductUsingBigIntegerWhenOneOfTheNumberIsZero() {
        BigInteger result = twoIntegersMultiplier.getProductUsingBigInteger(0, 6);
        assertEquals(result.intValue(), 0);
    }

    @Test
    public void testGetProductUsingBigIntegerWhenNumberIsBiggerThanInteger() {
        BigInteger result = twoIntegersMultiplier.getProductUsingBigInteger(123456789, 567892234);
        assertEquals(result.intValue(), -1079029806);
    }

}