package datastructure.array;

/**
 * @author piksel
 */
public class MergeSortAlgorithm {

    public static void main(String[] args) {
        int A[] = {2, 4, 5, 7, 9, 10, 1, 3, 6, 8, 11, 12};
        mergeSort(A, new int[A.length], 0, A.length - 1);
    }


    //Time complexity of merge sort is O(n log(n)
    private static void mergeSort(int[] A, int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        int middle = (leftStart + rightEnd) / 2;
        mergeSort(A, temp, leftStart, middle);
        mergeSort(A, temp, middle + 1, rightEnd);
        mergeHalves(A, temp, leftStart, rightEnd);
    }

    private static void mergeHalves(int[] A, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;

        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftStart && right <= rightEnd) {
            if (A[left] <= A[right]) {
                temp[index] = A[left];

                left++;
            } else {
                temp[index] = A[right];
                right++;
            }
            index++;
        }

        System.arraycopy(A, left, temp, index, leftEnd - left + 1);
        System.arraycopy(A, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, A, leftStart, size);
    }

}
