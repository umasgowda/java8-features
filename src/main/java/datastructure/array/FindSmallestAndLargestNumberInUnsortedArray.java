package datastructure.array;

public class FindSmallestAndLargestNumberInUnsortedArray {

    public static void main(String[] args) {
        int input[] = {20, 1, 10, 34, 25, 68, 79, 5, 100};
        int smallest = input[0];
        int biggest = input[0];

        for (int i = 0; i < input.length; i++) {
            if (input[i] > biggest) {
                biggest = input[i];
            } else if (input[i] < smallest) {
                smallest = input[i];
            }
        }

        System.out.println("smallest number is " + smallest);
        System.out.println("biggest number is " + biggest);
    }

}
