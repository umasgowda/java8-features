package datastructure.string;

import java.util.regex.Pattern;

public class CheckStringIsDigit {

    public static void main(String[] args) {

        String input = "a234";

        System.out.println(" is Numeric using plain java? " + checkStringIsNumericUsingJava(input));
        System.out.println(" is Numeric using regular expression ? " + checkStringIsNumericUsingRegularExpression(input));

    }

    private static boolean checkStringIsNumericUsingJava(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static boolean checkStringIsNumericUsingRegularExpression(String input) {
        if (input.isEmpty()) {
            return false;
        }
        Pattern pattern = Pattern.compile(".*[^0-9].*");
        return pattern.matcher(input).matches();
    }

}
