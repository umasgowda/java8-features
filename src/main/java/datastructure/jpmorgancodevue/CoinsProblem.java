package datastructure.jpmorgancodevue;

import java.util.Arrays;

/**
 * Given coins of value 1, 3, and 6 and a sum, what is the minimum number of coins needed to reach the sum?
 * Example:
 * Sum: 11
 * Minimum coins needed: 4 (1 6-Value coin, 1 3-Value coin, 2 1-Value coins)
 * <p>
 * Input: coins[] = {25, 10, 5}, sum = 30
 * Output: Minimum 2 coins required. We can use one coin of 25 cents and one of 5 cents
 */
public class CoinsProblem {
    public static void main(String[] args) {

        int coins[] = {1, 2, 5};
        int target = 6;

        System.out.println(coinChange(coins, target));
    }

    //Time complexity is O(amount * num_of_coins) and space complexity is O(amount).

    /**
     *
     The solution one use a 2-D array for DP. If we look at the previous amount column value that is used in later amount column,
     the later column only cares about the minimum value of the previous column. Therefore, we can use a 1-D array instead of the 2-D array.
     Given an amount of 6 and coins [1,2,5], we can look backward in the dp array.
     */
    private static int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }

        int[] dp = new int[amount + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i <= amount; i++) {
            if (dp[i] == Integer.MAX_VALUE) {
                continue;
            }

            for (int coin : coins) {
                if (i <= amount - coin) { //handle case when coin is Integer.MAX_VALUE
                    dp[i + coin] = Math.min(dp[i] + 1, dp[i + coin]);
                }
            }
        }
        if (dp[amount] == Integer.MAX_VALUE) {
            return -1;
        }

        return dp[amount];
    }
}


