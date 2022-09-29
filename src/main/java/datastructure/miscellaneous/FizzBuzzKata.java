package datastructure.miscellaneous;

/**
 * @author piksel
 */
public class FizzBuzzKata {


    public String of(int i) {
        if (i == 0) {
            return "0";
        }
        String s = "";

        if (i % 3 == 0) {
            s += "Fizz";
        }
        if (i % 5 == 0) {
            s += "Buzz";
        }

        return s.isEmpty() ? String.valueOf(i) : s;
    }
}
