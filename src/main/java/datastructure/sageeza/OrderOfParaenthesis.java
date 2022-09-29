package datastructure.sageeza;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Write a function called that takes a string of parentheses, and determines if the order of the parentheses is valid.
 * The function should return true if the string is valid, and false if it's invalid.
 * <p>
 * Examples
 * "()"              =>  true
 * ")(()))"          =>  false
 * "("               =>  false
 * "(())((()())())"  =>  true
 */
public class OrderOfParaenthesis {


    public static void main(String[] args) {
        String s = "(())[]";


        boolean result = checkBalanced(s);
        System.out.println("input is " + result);

    }

    private static boolean checkBalanced(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);

            if (x == '(' || x == '{' || x == '[') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char check = stack.pop();

            switch (x) {
                case ')':
                    if (check != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (check != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (check != '[') {
                        return false;
                    }
                    break;
            }

        }
        return stack.isEmpty();
    }
}
