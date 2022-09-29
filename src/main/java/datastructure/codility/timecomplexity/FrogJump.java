package datastructure.codility.timecomplexity;

/**
 * FrogJmp
 * START
 * Count minimal number of jumps from position X to Y.
 * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
 * <p>
 * Count the minimal number of jumps that the small frog must perform to reach its target.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int X, int Y, int D); }
 * <p>
 * that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
 * <p>
 * For example, given:
 * <p>
 * X = 10
 * Y = 85
 * D = 30
 * the function should return 3, because the frog will be positioned as follows:
 * <p>
 * after the first jump, at position 10 + 30 = 40
 * after the second jump, at position 10 + 30 + 30 = 70
 * after the third jump, at position 10 + 30 + 30 + 30 = 100
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * X, Y and D are integers within the range [1..1,000,000,000];
 * X ≤ Y.
 */
public class FrogJump {

    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;
        System.out.println("1st solution=" + solution1(X, Y, D));
        System.out.println("2nd solution=" + solution2(X, Y, D));
    }

    private static int solution1(int X, int Y, int D) {
        return  (int) Math.ceil((Y - X) / (float) D);
    }

    private static int solution2(int start, int end, int distance) {
        // X=start, Y=end, D=distance for code clarity
        int progress = start;
        int count = 0;
        while (progress < end) {
            progress = progress + distance;
            count++;
        }
        return count;
    }
}
