package datastructure.codility.stacksandqueues;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 * N voracious fish are moving along a river. Calculate how many fish are alive.
 * https://app.codility.com/programmers/lessons/7-stacks_and_queues/fish/
 */
public class Fishes {

    public static void main(String[] args) {
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        int result = solution(A, B);
        System.out.println(result);
    }

    private static int solution(int[] A, int[] B) {
        ArrayDeque<Integer> downstreams = new ArrayDeque<>();
        int alive = 0;
        for (int i = 0; i < A.length; i++) {
            int currFish = A[i] * (B[i] == 1 ? -1 : 1);
            if (currFish < 0) {
                downstreams.push(currFish);
                alive++;
            } else {
                Iterator it = downstreams.iterator();
                boolean eaten = false;
                while (it.hasNext()) {
                    int down = (int) it.next();
                    if (Math.abs(currFish) > Math.abs(down)) {
                        it.remove();
                        alive--;
                        eaten = false;
                    } else {
                        eaten = true;
                        break;
                    }
                }
                if (!eaten) {
                    alive++;
                }
            }
        }
        return alive;
    }
}
