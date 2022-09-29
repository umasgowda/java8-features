package datastructure.miscellaneous;

import java.util.Random;

/**
 * @author piksel
 */
public class GenerateRandomNumberAndStrings {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber  = random.nextInt(1000);
        System.out.println(randomNumber);



    }
}
