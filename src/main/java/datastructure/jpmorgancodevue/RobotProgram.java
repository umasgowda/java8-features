package datastructure.jpmorgancodevue;

import java.util.Scanner;

/**
 * #Asteriod mining
 * Programming challenge description :
 * You are starting an asteriod mining mission with a single harvester robot.
 * The robot is capable of mining one gram of mineral per day. It also has the ability to clone itself by constructing another harvester robot.
 * That new robot becomes available for use the next day and can be involved in the mining process or can be used to construct another yet another robot.
 * <p>
 * Each day you will decide what you want each robot in your fleet to do. They can either mine one gram of mineral or spend the day constructing another robot.
 * <p>
 * Write a program to compute a minimum number of days required to mine n grams of mineral.
 * <p>
 * Note you can mine more mineral than required. Just ensure you spent the minimum possible number of days to have the necessary amount of mineral mined.
 * <p>
 * Input: A single integer number n,  which is the number of grams of mineral to be mined.
 * The value of n will be between 1 and 1000000(inclusive).
 * For example: 9
 * Output: A single integer, number of days required to mine n grams of mineral. For example: 5
 * <p>
 * Test Case 1-  input 1 , expected output 1
 * Test Case 2- input 4, expected output 3
 * Test Case 3- input 99, expected output 8
 * Test Case 4- input 1000000, expected output 21
 */
public class RobotProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);

        int res = findMinDays(n);
        System.out.println(res);
    }

    private static int findMinDays(int numberOfDays) {

        if (numberOfDays == 0) {
            return numberOfDays;
        }
        if (numberOfDays == 1) {
            return numberOfDays;
        }

        int n = numberOfDays;
        int count = 0;
        while (n != 0) {
            n = n >> 1;// right shift operator
            count = count + 1;
        }
        if (numberOfDays != 2 * (count - 1)) {
            count = count + 1;
        }
        return count;
    }


}

