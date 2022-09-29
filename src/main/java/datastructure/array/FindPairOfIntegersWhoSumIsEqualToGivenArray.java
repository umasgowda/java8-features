package datastructure.array;

public class FindPairOfIntegersWhoSumIsEqualToGivenArray {

    public static void main(String[] args) {
        int[] input = {2, 3, 5, 11, -3, 4, 4, 1, 7, 7, -1};
        int targetSum = 8;
        findPair(input, targetSum);
    }

    private static void findPair(int[] input, int targetSum) {
        for (int i = 0; i < input.length - 1; i++) {
            int current = input[i];
            int next = input[i + 1];
            int findSum = next + current;
            if (findSum == targetSum) {
                System.out.println("pair is {" + current + " " + next + "}");
            }
        }
    }



}
