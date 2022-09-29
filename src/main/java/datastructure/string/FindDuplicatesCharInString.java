package datastructure.string;

import java.util.HashMap;
import java.util.Map;

/**
 * How to Print duplicate characters from String?
 * For example, if String is "Java" then the program should print "a".
 * Bonus points if your program is robust and handles different kinds of input e.g. String without duplicate, null or empty String etc.
 * Bonus points if you also write unit tests for normal and edge cases.
 */
public class FindDuplicatesCharInString {

    public static void main(String[] args) {
        String input = "java";

        Map<Character, Integer> duplicates = new HashMap<>();
        for (char c : input.toCharArray()) {
            int count = duplicates.containsKey(c) ? duplicates.get(c) + 1 : 1;
            duplicates.put(c, count);
        }

        for (Map.Entry<Character, Integer> entry : duplicates.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("duplicate character " + entry.getKey());
            }
        }
    }

}
