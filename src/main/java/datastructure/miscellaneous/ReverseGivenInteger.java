package datastructure.miscellaneous;

/**
 * @author piksel
 */
public class ReverseGivenInteger {

    public static void main(String[] args) {
        int input = 1234;

        int reverse = 0;
        while (input > 0) {
            int remainder = input % 10;
            reverse = reverse * 10 + remainder;
            input = input / 10;
        }
        System.out.println("reverse of given number " + reverse);
    }
}
