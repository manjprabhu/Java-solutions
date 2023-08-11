package com.mnj.java_solutions.dynamicprogramming;

/**
 * You are given an integer array coins representing coins of different denominations and
 * an integer amount representing a total amount of money.
 * <p>
 * Return the fewest number of coins that you need to make up that amount.
 * If that amount of money cannot be made up by any combination of the coins, return -1.
 * <p>
 * You may assume that you have an infinite number of each kind of coin.
 **/

public class CoinChangeLC322 {

    public void coinChange() {

        int[] coins = {1, 2, 5};
        int amount = 11;

        if (amount < 1) {
            System.out.println("==>> Amount is less than zero");
            return;
        }
        int[] minCoinsDP = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {
            minCoinsDP[i] = Integer.MAX_VALUE;

            for (int coin : coins) {
                if (coin <= i && minCoinsDP[i - coin] != Integer.MAX_VALUE)
                    minCoinsDP[i] = Math.min(minCoinsDP[i], 1 + minCoinsDP[i - coin]);
            }
        }

        int result = minCoinsDP[amount] == Integer.MAX_VALUE ? -1 : minCoinsDP[amount];
        System.out.println("==>> Result  is  :" + result);
    }
}
