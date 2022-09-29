package datastructure.miscellaneous;

/**
 * @author piksel
 */
public class Count1sInBitSequence {
    public static void main(String[] args) {
        String input = "1000110010";

        int result1 = solution1(input);
        System.out.println("number of 1s in bit sequence " + result1);

        int result2 = solution2(input);
        System.out.println("another solution " + result2);
    }

    private static int solution1(String input) {
        int number = Integer.parseInt(input, 2);
        int count = 0;
        while (number != 0) {
            number = number & (number - 1);
            count++;
        }
        return count;
    }

    private static int solution2(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

}
