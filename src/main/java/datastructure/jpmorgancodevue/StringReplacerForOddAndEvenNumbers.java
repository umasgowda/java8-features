package datastructure.jpmorgancodevue;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A String is provided as input from console which consists of integer value.
 * Insert '*' if subsequent numbers are even
 * Insert '-' if subsequent numbers are odd.
 * <p>
 * <p>
 * Input: 21462675756 Output: 2146*2*67-5-7-56
 * Input: 98676555533 Output: 98*6765-5-5-5-3-3
 */
public class StringReplacerForOddAndEvenNumbers {

    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input ");
        String input = scanner.nextLine();
        //String input = "21462675756";

        String result1 = insertUsingBitwiseAndOperator(input);
        System.out.println("Using bitwise AND operator " + result1);

        String result2 = insertUsingRegularExpression(input);
        System.out.println("Using regular expression " + result2);
    }


    private static String insert(String regularExpression, String input, String strToBeInserted) {
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll(strToBeInserted);
    }

    private static String insertUsingRegularExpression(String input) {
        String regularExpressionForOdd = "(?<=[13579])(?=[13579])";
        String result = insert(regularExpressionForOdd, input, "-");

        String regularExpressionForEven = "(?<=[02468])(?=[02468])";
        result = insert(regularExpressionForEven, result, "*");
        return result;

    }


    private static String insertUsingBitwiseAndOperator(String input) {
        StringBuilder sb = new StringBuilder(input);
        for (int i = 0; i < input.length() - 1; i++) {
            if (checkEven(input.charAt(i)) && checkEven(input.charAt(i + 1))) {
                sb.insert(i + 1, "*");
                input = sb.toString();
                i++;
            }
            if (checkOdd(input.charAt(i)) && checkOdd(input.charAt(i + 1))) {
                sb.insert(i + 1, "-");
                input = sb.toString();
                i++;
            }
        }
        return sb.toString();
    }

    //compare 2 consecutive characters using logical AND operator
    private static boolean checkEven(char inputChar) {
        return ((inputChar - '0') & 1) == 0;
    }

    private static boolean checkOdd(char inputChar) {
        return ((inputChar - '0') & 1) != 0;
    }
}
