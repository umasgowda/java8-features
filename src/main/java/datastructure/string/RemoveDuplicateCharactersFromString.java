package datastructure.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Remove duplicate characters from a given string keeping only the first occurrences.
 * For example, if the input is ‘bananas’ the output will be ‘bans’
 */
public class RemoveDuplicateCharactersFromString {

    public static void main(String[] args) {

        String input = "samsmau";

        List<Character> charsList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(char c: input.toCharArray()) {
           if(!charsList.contains(c)) {
               charsList.add(c);
               sb.append(c);
           }
        }
        System.out.println(" ---" + sb.toString());

    }
}
