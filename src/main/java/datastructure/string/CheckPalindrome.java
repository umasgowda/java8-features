package datastructure.string;

/**
 * Write a program to check if the given String is Palindrome?
 * After reversing the given String input, the reversed string should be same as the input.
 * For example, if the input is "radar", the output should be true, if the input is "madam" output will be true,
 * and if the input is "Java" output should be false.
 */

public class CheckPalindrome {

    public static void main(String[] args) {

        System.out.println("checkPalindromeUsingIterative - Is palindrome ? " + checkPalindromeUsingIterative("racecar"));
        System.out.println("checkPalindromeUsingStringBuilderReverse - is Palindrome? " + checkPalindromeUsingStringBuilderReverse("racecar"));
        System.out.println("checkPalindromeUsingStringBufferReverse - is palindrome? " + checkPalindromeUsingStringBufferReverse("racecar"));
        System.out.println("checkPalindromeUsingRecursion - is palindrome ? " + checkPalindromeUsingRecursion("racecar"));
    }

    private static boolean checkPalindromeUsingIterative(String input) {
        char[] inputCharArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = inputCharArray.length - 1; i >= 0; i--) {
            sb.append(inputCharArray[i]);
        }
        return sb.toString().equals(input);
    }

    private static boolean checkPalindromeUsingStringBuilderReverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString().equals(input);
    }

    private static boolean checkPalindromeUsingStringBufferReverse(String input) {
        StringBuffer sb = new StringBuffer(input);
        return sb.reverse().toString().equals(input);
    }

    private static boolean checkPalindromeUsingRecursion(String input) {
        String reversedString = reverseAStringUsingRecursion(input);
        return reversedString.equals(input);
    }

    private static String reverseAStringUsingRecursion(String input) {
        if (input.isEmpty()) {
            return input;
        }
        return reverseAStringUsingRecursion(input.substring(1)) + input.charAt(0);
    }


}
