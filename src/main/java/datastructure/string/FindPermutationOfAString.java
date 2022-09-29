package datastructure.string;

/**
 * Write a program to print all permutations of a String in Java.
 * A String of n characters there are n! (factorial of n) permutations are possible.
 * <p>
 * For example, if the input is "xyz", here there are 3 characters in a String.So it is 3! = 3*2*1 = 6.
 * There are 6 combinations. Then it should print "xyz", "yzx", "zxy", "xzy", "yxz", "zyx".
 */
public class FindPermutationOfAString {

    public static void main(String[] args) {

        findPermutation("123");
    }

    private static void findPermutation(String input) {
        //pass an empty String as initial value of perm parameter which is used to store intermediate permutation of String.
        findPermutation(input, "");
    }

    /**
     *
     * Time complexity of this algorithm looks n*!n because loop will run for n times and for each n and will call permutation method
     */
    private static void findPermutation(String input, String perm) {
        if (input.isEmpty()) {
            System.out.println(perm);
        } else {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                String restOfTheString = input.substring(0, i) + input.substring(i + 1);
                findPermutation(restOfTheString, perm + c);
            }
        }
    }
}
