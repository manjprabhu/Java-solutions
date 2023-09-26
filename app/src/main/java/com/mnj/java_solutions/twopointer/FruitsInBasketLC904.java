package com.mnj.java_solutions.twopointer;

import java.util.HashMap;
import java.util.Map;

/**
 * You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
 * <p>
 * You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
 * <p>
 * You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
 * Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
 * Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
 * Given the integer array fruits, return the maximum number of fruits you can pick.
 *
 * Example 1:
 *
 * Input: fruits = [1,2,1]
 * Output: 3
 * Explanation: We can pick from all 3 trees.
 *
 *
 * Example 2:
 *
 * Input: fruits = [0,1,2,2]
 * Output: 3
 * Explanation: We can pick from trees [1,2,2].
 * If we had started at the first tree, we would only pick from trees [0,1].
 *
 * Example 3:
 *
 *
 * Input: fruits = [1,2,3,2,2]
 * Output: 4
 * Explanation: We can pick from trees [2,3,2,2].
 * If we had started at the first tree, we would only pick from trees [1,2].
 *
 *
 * Another way to put this problem is
 *
 * Question : Given an array where each element represents a type of fruit. Determine the maximum number of contiguous
 * fruits you can pick such that the basket can have only 2 different type of fruits.
 *
 * Summary : Find the length of the longest contiguous subarray with at most  2 distinct integers.
 **/

public class FruitsInBasketLC904 {

    public void totalFruit() {
        int[]  fruits = {0,1,2,2};
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0;
        int right;
        int maxFruits = 0;

        for (right = 0; right < fruits.length; right++) {
            // Add current to basket
            int currentCount = basket.getOrDefault(fruits[right], 0);
            basket.put(fruits[right], currentCount + 1);

            // If basket has more than 2 type of fruits,
            // start emptying the basket
            while (basket.size() > 2) {
                int fruitCount = basket.get(fruits[left]);
                if (fruitCount == 1)
                    basket.remove(fruits[left]);
                else
                    basket.put(fruits[left], fruitCount - 1);
                left++;
            }

            maxFruits = Math.max(maxFruits, right - left + 1);
        }
        System.out.println("==>> maximum fruits :"+maxFruits);
    }
}
