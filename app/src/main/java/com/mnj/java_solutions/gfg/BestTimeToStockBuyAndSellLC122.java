package com.mnj.java_solutions.gfg;

/**
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
 * <p>
 * However, you can buy it then immediately sell it on the same day.
 * <p>
 * Find and return the maximum profit you can achieve.
 * <p>
 * Input: prices = [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * Total profit is 4 + 3 = 7.
 ***/
public class BestTimeToStockBuyAndSellLC122 {

    public void maxProfit() {
        int[] prices = {7, 1, 5, 3, 6, 4};//{3, 4, 1, 5};//{5, 2, 6, 1, 4, 7, 3, 6};

        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            //Compare today's price with previous day's stock price.
            if (prices[i] > prices[i - 1]) {
                profit = profit + (prices[i] - prices[i - 1]);
            }
        }
        System.out.println("==>> Maximum profit :" + profit);
    }
}
