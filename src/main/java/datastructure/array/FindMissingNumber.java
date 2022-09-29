package datastructure.array;

public class FindMissingNumber {

    public static void main(String[] args) {
        Integer[] input1 = {1, 2, 3, 5};
        //find missing number - only when 1 number is missing.
        findOneMissingNumber(input1);

        //find missing numbers from sorted integer array containing duplicates.
        int[] input2 = {1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
        findMissingNumbersFromDuplicateArray(input2);

        //find missing numbers - when there are many numbers are missing.
        int[] input = {1, 2, 4, 7, 8, 10};
        findMissingNumbersFromSortedArray(input);
    }

    private static void findMissingNumbersFromSortedArray(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int current = input[i];
            int next = input[i + 1];
            if (next - current > 1) {
                for (int j = 1; j < next - current; j++) {
                    System.out.println("missing numbers: " + (current + j));
                }
            }
        }
    }

    private static void findMissingNumbersFromDuplicateArray(int[] input) {
        int[] register = new int[input.length];
        for (int i : input) {
            register[i] = 1;
        }
        for (int i = 1; i < register.length; i++) {
            if (register[i] == 0) {
                System.out.println(" Find missing numbers from sorted duplicate array " + i);
            }
        }
    }

    private static void findOneMissingNumber(Integer[] input) {
        int total = (input.length + 1) * (input.length + 2) / 2;
        int sumofinput = 0;

        for (int i = 0; i < input.length; i++) {
            sumofinput = sumofinput + input[i];
        }
        int missingNumber = total - sumofinput;
        System.out.println(" missing number when there is only one number missing " + missingNumber);
    }

}
