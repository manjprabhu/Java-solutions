package com.mnj.java_solutions.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
 * <p>
 * Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
 * <p>
 * a, b are from arr
 * a < b
 * b - a equals to the minimum absolute difference of any two elements in arr
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [4,2,1,3]
 * Output: [[1,2],[2,3],[3,4]]
 * Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
 * Example 2:
 * <p>
 * Input: arr = [1,3,6,10,15]
 * Output: [[1,3]]
 * Example 3:
 * <p>
 * Input: arr = [3,8,-10,23,19,-4,-14,27]
 * Output: [[-14,-10],[19,23],[23,27]]
 **/
public class MinimumAbsoluteDifferenceLC1200 {

    public void minimumAbsDifference() {

        int[] arr = {4, 2, 1, 3};
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();

        //to find the minimum difference
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(arr[i] - arr[i - 1], min);
        }

        //to find the pair with minimum difference
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == min) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i - 1]);
                result.add(pair);
            }
        }
    }
}
