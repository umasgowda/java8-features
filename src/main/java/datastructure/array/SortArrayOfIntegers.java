package datastructure.array;

import java.util.Arrays;

/**
 * Array of Integers - Sorting from biggest to smallest and viceversa
 *
 * To sort an array in Java, you need to compare each element of the array to all the remaining elements and verify whether it is greater if so swap them.
 */
public class SortArrayOfIntegers {

    public int[] sortIntArrayInAscendingOrder(int[] input) {
        for (int i = 0; i < input.length; i++) { // the outer loop selects the elements
            for (int j = i + 1; j < input.length; j++) { //inner loop compares the selected element with rest of the elements.
                if (input[i] > input[j]) {
                   int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;

    }

    public int[] sortIntArrayInDescendingOrder(int[] input) {
        int temp = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] < input[j]) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }

    public int[] sortArrayInPlaceInReverseOrder(int[] input) {
        int lastIndex = input.length - 1;
        int middleIndex = input.length / 2;
        int temp = 0;
        for (int i = 0; i < middleIndex; i++) {
            temp = input[i];
            input[i] = input[lastIndex - i];
            input[lastIndex - i] = temp;
        }
        return input;
    }

    public int[] sortInAscOrderUsingArraySortFunction(int[] input) {
        Arrays.sort(input);
        return input;
    }

    public int[] sortInDescendingOrderUsingArraySortFunction(int[] input) {
        Arrays.sort(input);
        return sortArrayInPlaceInReverseOrder(input);
    }
}
