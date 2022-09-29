package datastructure.array;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInArray {

    public static void main(String[] args) {

        Integer[] input = {1, 2, 3, 2, 4, 5, 4, 6};
        Map<Integer, Integer> duplicates = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            int count = 1;
            if (duplicates.containsKey(input[i])) {
                duplicates.put(input[i], count + 1);

            } else {
                duplicates.put(input[i], count);
            }
        }

        for (Map.Entry<Integer, Integer> entry : duplicates.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("duplicates are  " + entry.getKey());
            }
        }

    }

}
