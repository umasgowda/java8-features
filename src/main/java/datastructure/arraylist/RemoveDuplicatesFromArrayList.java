package datastructure.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Since ArrayList is a List interface, it allows duplicates.
 * While Set does not allow duplicates.
 */

public class RemoveDuplicatesFromArrayList {

    public static void main(String[] args) {

        List<String> duplicatesList = new ArrayList<>();
        duplicatesList.add("a");
        duplicatesList.add("a");
        duplicatesList.add("b");
        duplicatesList.add("c");

        Set<String> newSet = duplicatesList.stream().collect(Collectors.toSet());
        System.out.println(" check is there duplicates " + newSet);
    }
}
