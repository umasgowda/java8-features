package datastructure.string;

/**
 * @author piksel
 */
public class RemoveGivenCharFromString {

    public static void main(String[] args) {
        String inputString = "abc";
        char inputCh = 'c';

        System.out.println("using iterative " + removeGivenCharUsingIterative(inputString, inputCh));
        System.out.println(" using recursive " + removeGivenCharUsingRecursive(inputString, inputCh));
    }


    private static String removeGivenCharUsingIterative(String inputString, char inputCh) {
        for (char c : inputString.toCharArray()) {
            if (c == inputCh) {
                int index = inputString.indexOf(inputCh);
                inputString = inputString.substring(0, index) + inputString.substring(index + 1);
            }
        }
        return inputString;
    }


    private static String removeGivenCharUsingRecursive(String inputString, char inputCh) {
        int index = inputString.indexOf(inputCh);
        if (index == -1) {
            return inputString;
        }
        String ros = inputString.substring(0, index) + inputString.substring(index + 1);
        return removeGivenCharUsingRecursive(ros, inputCh);
    }
}
