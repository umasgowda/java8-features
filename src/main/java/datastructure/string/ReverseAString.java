package datastructure.string;


public class ReverseAString {

    /*
     * There are several ways to reverse a String 1. Using iteration 2 pointers 2. using iteration swap 3. Using
     * recursion 4. Using StringBuffer and StringBuilder 5. Using library
     */


    //reverse a String using StringBuilder reverse method
    private static String reverseAStringUsingStringBuilder(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    // reverse a String manually
    public static String reverseAStringManually(String input) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString.append(input.charAt(i));
        }
        return reversedString.toString();
    }

    // reverse a String using recursion method
    private static String reverseAStringUsingRecursiveMethod(String input) {
        if (input.isEmpty()) {
            return input;
        }
        System.out.println("String passed to recursive function " + input.substring(1));
        return reverseAStringUsingRecursiveMethod(input.substring(1)) + input.charAt(0);
    }


    public static void main(String[] args) {
        int a = 10;

        String aNumber = String.valueOf(a);
    }


}
