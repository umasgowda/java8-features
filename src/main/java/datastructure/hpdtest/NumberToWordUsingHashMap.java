package datastructure.hpdtest;


import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Describe the techniques that you would use to store a range of single digit integers and their value in words (in English).
 * Write a method that takes in, as arguments, an int and a Locale, which would return a String containing the textual value of that number in the language requested
 */

public class NumberToWordUsingHashMap {

    public static void main(String[] args) {
        int inputNumber = 2;
        System.out.println(" a word for number in english " + inputNumber + " = " + getWord(inputNumber, Locale.ENGLISH));
        System.out.println(" a word for number in French " + inputNumber + " = " + getWord(inputNumber, Locale.FRENCH));
    }

    private static String getWord(int number, Locale locale) {
        return getWordForGivenNumber(number, getWordsForGivenLocale(locale));
    }

    private static Map<Integer, String> getWordsForGivenLocale(Locale locale) {
        Map<Integer, String> aWordMap = new HashMap<>();
        if (Locale.ENGLISH.equals(locale)) {
            aWordMap = EnglishMapper.ENGLISH_WORDS;
        } else if (Locale.FRENCH.equals(locale)) {
            aWordMap = FrenchMapper.FRENCH_WORDS;
        }
        return aWordMap;
    }

    private static String getWordForGivenNumber(int number, Map<Integer, String> aWordMap) {
        for (Map.Entry<Integer, String> entry : aWordMap.entrySet()) {
            if (entry.getKey().equals(number)) {
                return entry.getValue();
            }
        }
        return null;
    }
}

class FrenchMapper {
    static Map<Integer, String> FRENCH_WORDS = digitToWordInFrenchMap();

    private static Map<Integer, String> digitToWordInFrenchMap() {
        Map<Integer, String> oneDigitNumberToWord = new HashMap<>();
        oneDigitNumberToWord.put(0, "Zero");
        oneDigitNumberToWord.put(1, "Un");
        oneDigitNumberToWord.put(2, "Deux");
        oneDigitNumberToWord.put(3, "Trois");
        oneDigitNumberToWord.put(4, "Quatre");
        oneDigitNumberToWord.put(5, "Cinq");
        oneDigitNumberToWord.put(6, "Six");
        oneDigitNumberToWord.put(7, "Sept");
        oneDigitNumberToWord.put(8, "Huit");
        oneDigitNumberToWord.put(9, "Neuf");
        return oneDigitNumberToWord;
    }

}

class EnglishMapper {
    static Map<Integer, String> ENGLISH_WORDS = digitToWordInEnglishMap();

    private static Map<Integer, String> digitToWordInEnglishMap() {
        Map<Integer, String> oneDigitNumberToWord = new HashMap<>();
        oneDigitNumberToWord.put(0, "zero");
        oneDigitNumberToWord.put(1, "one");
        oneDigitNumberToWord.put(2, "two");
        oneDigitNumberToWord.put(3, "three");
        oneDigitNumberToWord.put(4, "four");
        oneDigitNumberToWord.put(5, "five");
        oneDigitNumberToWord.put(6, "six");
        oneDigitNumberToWord.put(7, "seven");
        oneDigitNumberToWord.put(8, "eight");
        oneDigitNumberToWord.put(9, "nine");
        return oneDigitNumberToWord;
    }

}
