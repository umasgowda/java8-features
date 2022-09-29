package datastructure.jpmorgancodevue;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Write a program to check given string is pangram.
 * Pangrams are words or sentences containing every letter of the alphabet at least once.
 * Example:  A quick brown fox jumps over the lazy dog
 */
public class FindStringIsPangram {


    public static void main(String[] args) {
        // String input = "We promptly judged antique ivory buckles for the next prize";

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Entered input String is - " + input);
        boolean result = isPangram(input);
        System.out.println(result ? "Is Pangram" : "Not Pangram");
    }


    private static boolean isPangram(String input) {
        if (input == null || input.length() < 26) {
            return false;
        }
        Set<Character> aCharSet = new HashSet<>();
        for (char c : input.toCharArray())
            if (Character.isLetter(c) && !Character.isWhitespace(c)) {
                aCharSet.add(c);
            }
        return aCharSet.size() == 26;
    }
}
