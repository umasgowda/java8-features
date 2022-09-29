package datastructure.miscellaneous;

/**
 * An Armstrong number is a 3 digit number for which sum of cube of its digits is equal to the number itself.
 * An example of Armstrong number is 153 as 153= 1+ 125+27 which is equal to 1^3+5^3+3^3.
 */
public class CheckArmstrongNumber {

    public static void main(String[] args) {
        int input = 123;

        int sum = 0;
        while(input > 0) {
            int remainder = input % 10;
            sum = sum + (remainder * remainder * remainder);
            input = input/10;
        }

        if(input == sum) {
            System.out.println("It is armstrong number sum =" + sum + " input = " + input);
        } else {
            System.out.println("It is NOT armstrong number sum =" + sum + " input = " + input);
        }


    }
}
