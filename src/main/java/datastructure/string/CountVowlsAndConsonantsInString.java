package datastructure.string;

import java.util.regex.Pattern;

public class CountVowlsAndConsonantsInString {

    public static void main(String[] args) {

        String input = "additions";

        int vowelsCount = getVowelsCountUsingJava(input);
        System.out.println(" vowels count using Java  " + vowelsCount);
        System.out.println(" consonants count using Java " + (input.length() - vowelsCount));

        System.out.println("vowels count using regex pattern " + getVowelsCountUsingRegex(input));
    }

    private static int getVowelsCountUsingJava(String input) {
        int vowelsCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    private static int getVowelsCountUsingRegex(String input) {
        int vowelsCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Pattern.matches("[aeiou]", Character.toString(ch))) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

}
