package datastructure.string;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Find the first non-repeated (unique) character in a given string.
 * For Example, if given String is "Morning" then it should print "M". This question demonstrates the efficient use of the hash table data structure.
 * "swiss" --first non-repeated character is w.
 *
 * Difference between LinkedHashMap and HashMap in Java
 * 1) First and foremost difference between LinkedHashMap and HashMap is order, HashMap doesn't maintain any order while LinkedHashMap maintains insertion order of elements in Java.
 * 2) LinkedHashMap also requires more memory than HashMap because of this ordering feature. As I said before LinkedHashMap uses doubly LinkedList to keep order of elements.
 * 3) LinkedHashMap actually extends HashMap and implements Map interface.
 */
public class FindFirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String input = "swiss";

        Character result = FindFirstNonRepeatedChar(input);
        System.out.println("first non-repeated character " + result);
    }

    /**
     * Using LinkedHashMap to find first non repeated character of String Algorithm :
     * Step 1: get character array and loop through it to build a hash table with char and their count.
     * Step 2: loop through LinkedHashMap to find an entry with value 1, that's your first non-repeated character,
     * as LinkedHashMap maintains insertion order.
     */

    private static Character FindFirstNonRepeatedChar(String input) {
        Map<Character, Integer> countCharacterMap = new LinkedHashMap<>(input.length());
        for (char c : input.toCharArray()) {
            int count = countCharacterMap.containsKey(c) ? countCharacterMap.get(c) + 1 : 1;
            countCharacterMap.put(c, count);
        }
        for (Map.Entry<Character, Integer> entry : countCharacterMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("did not find non-repeated character");
    }
}
