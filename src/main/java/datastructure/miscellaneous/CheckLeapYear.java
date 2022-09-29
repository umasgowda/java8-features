package datastructure.miscellaneous;

import java.util.Calendar;

/**
 * @author piksel
 */
public class CheckLeapYear {

    public static void main(String[] args) {

        int input = 2016;

        System.out.println("Find the leap year java logic ");
        checkLeapYearUsingModOperator(input);

        System.out.println("Find the lear year using Calendar ");
        checkLeapYearUsingCalender(input);

    }

    private static void checkLeapYearUsingModOperator(int input) {
        if (input % 400 == 0 || (input % 100 != 0 && input % 4 == 0)) {
            System.out.println("its a leap year " + input);
        } else {
            System.out.println("it's not a leap year " + input);
        }
    }

    private static void checkLeapYearUsingCalender(int input) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, input);
        int noOfDays = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);

        if (noOfDays > 365) {
            System.out.println(" It's a leap year " + input);
        } else {
            System.out.println(" It's not a leap year " + input);
        }
    }
}
