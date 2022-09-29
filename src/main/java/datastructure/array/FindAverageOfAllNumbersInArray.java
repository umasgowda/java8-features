package datastructure.array;

/**
 * How to calculate the average of all numbers in a given array?
 */
public class FindAverageOfAllNumbersInArray {

    public static void main(String[] args) {
        int[] input = {10, 2, 3, 4, 5};

        float sum = 0f;
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
        }
        float average = sum/input.length;
        System.out.println("average of all numbers " + average);
    }
}
