package datastructure.codility.maxsliceproblems;

/**
 * MaxProfit
 * Given a log of stock prices compute the maximum possible earning.
 * https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_profit/
 *
 * Find the best buy price and its corresponding best sell price (buy low, sell high).
 */
public class MaxProfit {

    public static void main(String[] args) {
        int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
        int result = solution(A);
        System.out.println(result);
    }

    private static int solution(int[] A) {
        int profit = 0;
        int bottom = Integer.MAX_VALUE;
        int top = 0;
        int currentBestSell = 0;
        int currentBestBuy = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < bottom) { //find lowest element in the array
                bottom = A[i];
            } else if (A[i] > top) { // find the top element in the array
                top = A[i];
                int currentProfit = top - bottom;
                if (currentProfit > profit) {
                    profit = currentProfit;
                    currentBestSell = top;
                    currentBestBuy = bottom;
                }
            }


        }
        System.out.println("best buy " + currentBestBuy);
        System.out.println("best sell " + currentBestSell);
        return profit;
    }


}
