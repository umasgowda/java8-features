package datastructure.codility.stacksandqueues;

import java.util.LinkedList;

/**
 * Determine whether a given string of parentheses (multiple types) is properly nested.
 * https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/
 */
public class FindStringBracketsNested {
    public static void main(String[] args) {

        //String s = "{[()()]}"; //properly nested string - parenthesis of multiple types
        // String s = "([)()]"; //not properly nested string - parenthesis of multiple types
        String s = "(()(())())";  //parenthesis of same type
        int result = solution(s);

        if (result == 1) {
            System.out.println("properly nested");
        } else {
            System.out.println("not properly nested");
        }

    }

    private static int solution(String s) {
        if (s.length() == 0) {
            return 1;
        }
        if (s.length() % 2 == 1) { //odd - not properly nested
            return 0;
        }
        LinkedList<Character> aLinkedList = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                aLinkedList.push(ch);
            } else {
                if (aLinkedList.isEmpty()) {
                    return 0;
                }
                char preceding = aLinkedList.pop();
                if (ch == ')' && preceding != '(') {
                    return 0;
                }

                if (ch == ']' && preceding != '[') {
                    return 0;
                }

                if (ch == '}' && preceding != '{') {
                    return 0;
                }
            }
        }

        return aLinkedList.isEmpty() ? 1 : 0;
    }
}
