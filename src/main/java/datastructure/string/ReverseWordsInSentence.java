package datastructure.string;

/**
 * @author piksel
 */
public class ReverseWordsInSentence {

    public static void main(String[] args) {
        String input = "Java is best programming language";
        System.out.println(" after reversing  using library - " + reverseWordsInSentenceUsingLibrary(input));
    }

    private static String reverseWordsInSentenceUsingLibrary(String input) {
        String[] inputArray = input.split("\\s");
        StringBuilder sb = new StringBuilder(input.length());
        for (int i = inputArray.length - 1; i >= 0; i--) {
            sb.append(inputArray[i] + " ");
        }
        return sb.toString();
    }
}
