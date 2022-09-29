package datastructure.array;

public class ReverseAnArrayElements {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6};

        int lastIndex = input.length -1;
        int middleIndex = input.length/2;

        for (int i = 0; i < middleIndex; i++) {
            int temp = input[i];
            input[i] = input[lastIndex-i];
            input[lastIndex-i] = temp;
        }

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }

}
