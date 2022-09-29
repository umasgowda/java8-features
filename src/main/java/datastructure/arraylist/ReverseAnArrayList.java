package datastructure.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author piksel
 */
public class ReverseAnArrayList {

    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        aList.add("a");
        aList.add("b");
        aList.add("c");

        Collections.reverse(aList);

        for (String s : aList) {
            System.out.println("after reversing" + s);
        }


    }
}
