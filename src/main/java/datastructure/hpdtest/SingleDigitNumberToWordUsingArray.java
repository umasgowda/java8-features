package datastructure.hpdtest;

import java.util.Locale;

/**
 * Describe the techniques that you would use to store a range of single digit integers and their value in words (in English).
 * Write a method that takes in, as arguments, an int and a Locale, which would return a String containing the textual value of that number in the language requested
 */
public class SingleDigitNumberToWordUsingArray {
    private static final String[] ENGLISH_WORDS = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] FRENCH_WORDS = {"zero", "Un", "Deux", "Trois", "Quatre", "Cinq", "Six", "Sept", "Huit", "Neuf"};

    public static void main(String[] args) {
        System.out.println(" Word for given number in English " + getWordForNumber(9, Locale.ENGLISH));
        System.out.println(" Word for given number in French " + getWordForNumber(9, Locale.FRENCH));
    }

    private static String getWordForNumber(int number, Locale locale) {
        if (Locale.ENGLISH.equals(locale)) {
            return ENGLISH_WORDS[number];
        } else if (Locale.FRENCH.equals(locale)) {
            return FRENCH_WORDS[number];
        }
        return null;
    }
}
