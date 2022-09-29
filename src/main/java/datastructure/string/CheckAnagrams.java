package datastructure.string;

import java.util.Arrays;

/**
 * How to check if two Strings are anagrams of each other?
 * A simple coding problem based upon String, but could also be asked with numbers.
 * You need to write a Java program to check if two given strings are anagrams of Each other.
 * Two strings are anagrams if they are written using the same exact letters, ignoring space, punctuation, and capitalization.
 * Each letter should have the same count in both strings.
 * For example, the Army and Mary are an anagram of each other
 */

public class CheckAnagrams {

    public static void main(String[] args) {
        //check by using Array Sorting method
        System.out.println("1. check anagram using Arrays sort method " + checkAnagram("mary", "yarm"));

        //check anagram using StringBuilder
        System.out.println("2. check anagram using String builder " + checkAnagramUsingStringBuilder("word", "ordw"));

        //check anagram using iterative method
        System.out.println("3. check anagram using iterative method - " + checkAnagramUsingIterative("mary", "yarm"));
    }

    private static boolean checkAnagramUsingStringBuilder(String input1, String input2) {
        boolean isAnagram = true;
        char[] inputArray = input1.toCharArray();
        StringBuilder sb = new StringBuilder(input2);

        for (char c : inputArray) {
            int index = sb.indexOf("" + c);
            if (index != -1) {
                sb.deleteCharAt(index);
            } else {
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }

    private static boolean checkAnagramUsingIterative(String input1, String input2) {
        //if the length of 2 input is not same, they are not anagram
        if (input1.length() != input2.length()) {
            return false;
        }
        //remove all the whitespace characters and convert it to lowercase
        input1.replaceAll("/s", "").toLowerCase();
        input2.replaceAll("/s", "").toLowerCase();

        char[] inputArray = input1.toCharArray();
        for (char c : inputArray) {
            int index = input2.indexOf(c);
            if (index != -1) {
                input2 = input2.substring(0, index) + input2.substring(index + 1);
            } else {
                return false;
            }
        }

        return input2.length() == 0;
    }

    private static boolean checkAnagram(String input, String anagram) {
        char[] inputArray = input.toCharArray();
        char[] anagramArray = anagram.toCharArray();
        Arrays.sort(inputArray);
        Arrays.sort(anagramArray);
        return Arrays.equals(inputArray, anagramArray);
    }
}
