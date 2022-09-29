package datastructure.jpmorgancodevue;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Find the smallest Kth element in an unsorted array if smallest kth element not present return NULL.
 * Input  - 0 1 0 1 1 1 1 0 0 1  K=3  output = NULL
 * Input - 9 3 2 7 2 5 3 8       K=4  output = 7
 * <p>
 * All inputs will be provided by console -
 * 1st line will consist of Kth element and
 * 2nd line will consists of array of numbers
 * <p>
 * Sample input :
 * 3
 * 0 1 0 1 1 1 1 0 0 1
 */

public class FindSmallestKthElement {

    public static void main(String[] args) throws IOException {

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Enter your input");
        //  String input = br.readLine();

        //1st Input
        // int inputArr[] = {9, 3, 2, 7, 2, 5, 3, 8};
        int inputArr[] = {0, 1, 0, 1, 1, 1, 1, 0, 0, 1};
        int k = 2;


        System.out.println("findKthSmallestElementUsingArraysSortMethod  " + findKthSmallestElementUsingArraysSortMethod(inputArr, k));
        System.out.println("findSmallestKthElementUsingBubbleSortAlgorithm " + findSmallestKthElementUsingBubbleSortAlgorithm(inputArr, k));
    }

    private static Integer findSmallestKthElementUsingBubbleSortAlgorithm(int[] input, int k) {
        sortArrayUsingBubbleSortAlgorithm(input);
        List<Integer> aDistinctList = Arrays.stream(input).boxed().distinct().collect(Collectors.toList());
        return (k <= aDistinctList.size() && k != 0) ? aDistinctList.get(k - 1) : null;
    }

    // Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
    // Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
    // https://www.geeksforgeeks.org/bubble-sort/
    private static void sortArrayUsingBubbleSortAlgorithm(int[] input) {
        for (int i = 0; i < input.length - 1; i++) { // the outer loop selects the elements
            for (int j = i + 1; j < input.length - 1; j++) { //inner loop compares the selected element with rest of the elements.
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
    }

    private static Integer findKthSmallestElementUsingArraysSortMethod(int[] input, int k) {
        Arrays.sort(input);
        List<Integer> aDistinctList = Arrays.stream(input).boxed().distinct().collect(Collectors.toList());
        return (k <= aDistinctList.size() && k != 0) ? aDistinctList.get(k - 1) : null;
    }

}
