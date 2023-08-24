package com.mnj.java_solutions;

import java.util.ArrayList;
import java.util.Stack;

/**
 * You are given an integer array prices where prices[i] is the price of the ith item in a shop.
 * <p>
 * There is a special discount for items in the shop. If you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i]. Otherwise, you will not receive any discount at all.
 * <p>
 * Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop, considering the special discount.
 * <p>
 * <p>
 * Input: prices = [8,4,6,2,3]
 * Output: [4,2,4,2,3]
 * Explanation:
 * For item 0 with price[0]=8 you will receive a discount equivalent to prices[1]=4, therefore, the final price you will pay is 8 - 4 = 4.
 * For item 1 with price[1]=4 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 4 - 2 = 2.
 * For item 2 with price[2]=6 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 6 - 2 = 4.
 * For items 3 and 4 you will not receive any discount at all.:wq
 * <p>
 * <p>
 * Input: prices = [1,2,3,4,5]
 * Output: [1,2,3,4,5]
 * Explanation: In this case, for all items, you will not receive any discount at all.
 **/
public class FinalPricesWithDiscountLC1475 {

    public void finalPrices() {
        int[] prices = {8, 4, 6, 2, 3};

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < prices.length - 1; i++) {

            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    result.add(prices[i] - prices[j]);
                } else {
                    result.add(0);
                }
            }
        }
        System.out.println("************* Discount **************8");
        for (int num : result) {
            System.out.println("==>> " + num);
        }
    }

    public void finalPrices2() {
        int[] prices = {8, 4, 6, 2, 3};
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = prices.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
                if (stack.isEmpty()) {
                    result.add(prices[i]);
                } else {
                    result.add(prices[i] - stack.peek());
                }
            }
            stack.push(prices[i]);
        }

        System.out.println(" 2 ************* Discount **************8");
        for (int num : result) {
            System.out.println("==>> " + num);
        }
    }

    public void finalPrices3() {
        int[] prices = {8, 4, 6, 2, 3};
        Stack<Integer> stack = new Stack<>();
        int arr[] = new int[prices.length];
        stack.push(prices[prices.length - 1]);
        arr[prices.length - 1] = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                arr[i] = prices[i];
            } else {
                arr[i] = prices[i] - stack.peek();
            }
            stack.push(prices[i]);
        }
        System.out.println("3 ************* Discount **************8");
        for (int num : arr) {
            System.out.println("==>> " + num);
        }
    }
}
