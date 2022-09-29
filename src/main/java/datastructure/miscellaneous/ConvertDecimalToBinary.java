package datastructure.miscellaneous;

/**
 * @author piksel
 */
public class ConvertDecimalToBinary {

    public static void main(String[] args) {
        int input = 20;
        convertToBinary(input);
    }

    private static void convertToBinary(int input) {
        byte[] binary = new byte[32];
        int index = 0;
        int copyOfInput = input;
        while (copyOfInput > 0) {
            binary[index++] = (byte) (copyOfInput % 2);
            copyOfInput = copyOfInput / 2;
        }

        for (int i = binary.length - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

}
