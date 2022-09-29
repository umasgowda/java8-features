package datastructure.codility.stacksandqueues;

import java.util.Stack;

/**
 * Stone Wall
 * Cover "Manhattan skyline" using the minimum number of rectangles.
 */
public class StoneWallStackDS {
    public static void main(String[] args) {
        int[] H = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        int res = solution(H);
        System.out.println(res);

    }

    //assumption height > 0
    // stack is used to hold height used to building and remove all the blocks from it,
    // if any of the block of stack is greater than current block(height in the array)
    private static int solution(int[] H) {
        int squares = 0;

        Stack<Integer> s = new Stack<>();
        s.push(0);
        for (int height : H) {
            while (s.peek() > height) {
                s.pop(); //Remove all blocks that are bigger than current height
            }
            if (s.peek() != height) {
                s.push(height);
                ++squares;
            }
        }

        return squares;
    }
}
