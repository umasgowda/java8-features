package datastructure.miscellaneous;

/**
 * Find Odd/Even number without using arithmetic operator
 */
public class FindOddAndEvenNumberWithoutArithmeticOperator {

    public static void main(String[] args) {

        int number = 13;
        usingModulusOperator(number);
        bitwiseAndOperator(number);
    }

    private static void bitwiseAndOperator(int number) {
        System.out.println(" Using bitwise AND operator ");
        if ((number & 1) == 0) {
            System.out.println(" even number " + number);
        } else {
            System.out.println(" odd number " + number);
        }
    }

    private static void usingModulusOperator(int number) {
        System.out.println(" Using modulous operator ");
        if(number % 2 == 0) {
            System.out.println(" even number " + number);
        } else{
            System.out.println(" odd number " + number);
        }
    }
}
