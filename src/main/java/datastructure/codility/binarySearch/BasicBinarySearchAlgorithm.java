package datastructure.codility.binarySearch;

/**
 * Find the index of given integer of an array.
 */
public class BasicBinarySearchAlgorithm {


    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 6, 7, 8};

        int target = 7;

        int result = BFSAlgorithm(A, target);
        System.out.println(result);
    }


    //Binary search runs in logarithmic time in the worst case, making  O(log n) comparisons, where n is the number of elements in the array
    private static int BFSAlgorithm(int[] A, int target) {
        int left = 0;
        int right = A.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2; //Binary search begins by comparing an element in the middle of the array with the target value
            if (A[middle] < target) { //If the target value is greater than the middle element, the search continues in the upper half of the array
                left = middle + 1;
            } else if (A[middle] > target) { //If the target value is less than the middle element, the search continues in the lower half of the array.
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1; //unsuccessful
    }

}
