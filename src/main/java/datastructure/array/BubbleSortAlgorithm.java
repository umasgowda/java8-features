package datastructure.array;

/**
 * You have been given an array A of size N . you need to sort this array non-decreasing oder using bubble sort.
 * However, you do not need to print the sorted array . You just need to print the number of swaps required to sort this array using bubble sort
 * <p>
 * Input Format
 * <p>
 * The first line consists of a single integer N denoting size of the array. The next line contains N space separated integers denoting the elements of the array.
 * <p>
 * Output Format Print the required answer in a single line
 * <p>
 * Constrains 1 < N < 100
 */
public class BubbleSortAlgorithm {

    public static void main(String[] args) {
        int[] A = {2, 1, 4, 3, 5, 6};

        int swapCount = bubbleSortAlgorithm(A);
        System.out.println("Number of swaps using bubble sort algorithm " + swapCount);
    }

    //Bubble sort algorithm - swapping the elements of an array
    //Best case complexity - O(N)
    //Worst and Average case complexity - O(N2) - because the entire array needs to be iterated for every element.
    private static int bubbleSortAlgorithm(int[] A) {
        int swapCount = 0;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                swap(A, i, i + 1);
                swapCount++;
            }
        }
        return swapCount;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
