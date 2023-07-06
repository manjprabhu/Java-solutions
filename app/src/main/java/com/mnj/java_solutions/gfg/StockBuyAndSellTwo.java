package com.mnj.java_solutions.gfg;

public class StockBuyAndSellTwo {

    public void maxProfit() {
        int[] prices = {1, 3, 5, 7, 9};//{3, 4, 1, 5};//{5, 2, 6, 1, 4, 7, 3, 6};

        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] > prices[i - 1]) {
                profit = profit + (prices[i] - prices[i - 1]);
            }
        }

        System.out.println("==>> Maximum profit :" + profit);
    }
}
