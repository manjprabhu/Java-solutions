package com.mnj.java_solutions;

import java.util.ArrayList;
import java.util.Stack;

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
