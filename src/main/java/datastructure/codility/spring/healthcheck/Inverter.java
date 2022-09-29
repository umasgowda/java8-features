package datastructure.codility.spring.healthcheck;

/**
 * @author uma.shivalingaiah
 */
public class Inverter {


    public static String invert(String inputStr) {
        if (inputStr.equals("")) {
            return inputStr;
        }
        if(inputStr.length() == 1) {
            return inputStr;
        }
        byte[] inputStrByteArr = inputStr.getBytes();
        byte[] result = new byte[inputStrByteArr.length];
        for (int i = 0; i < inputStrByteArr.length; i++)
            result[i] = inputStrByteArr[inputStrByteArr.length - i - 1];

        return new String(result);
    }
}
