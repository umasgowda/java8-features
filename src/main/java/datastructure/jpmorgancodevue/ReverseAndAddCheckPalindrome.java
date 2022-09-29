package datastructure.jpmorgancodevue;

/**
 * Given an integer, add it with the reverse of the value, and check if it’s a palindrome.
 * If it isn’t a palindrome, repeat the process until the sum is a palindrome.
 * Print out the number of iterations and the value of the final palindrome.
 * <p>
 * Example:
 * Starting Value: 121
 * Expected Result : 1 242
 * Add 121 to 121. The sum of 242 is a palindrome
 */
public class ReverseAndAddCheckPalindrome {


    public static void main(String[] args) {
        int orginalNumber = 121;
        System.out.println("input number " + orginalNumber);
        int reversedNumber = reverse(orginalNumber);
        System.out.println("reversed number " + reversedNumber);
        int number = orginalNumber + reversedNumber;
        System.out.println("original number + reversed number= "+ number);

        if (isPalindrome(number)) {
            System.out.println(number + " is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }

    private static int reverse(int number) {
        int sum = 0;
        while (number > 0) {
            int remainder = number % 10;
            sum = sum * 10 + remainder;
            number = number / 10;
        }
        return sum;
    }

    private static boolean isPalindrome(int number) {

        int afterReverse = reverse(number);
        return number == afterReverse;
    }
}
