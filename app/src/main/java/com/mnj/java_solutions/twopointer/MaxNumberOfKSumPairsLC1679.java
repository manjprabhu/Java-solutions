package com.mnj.java_solutions.twopointer;


import java.util.Arrays;
import java.util.HashMap;

/**
 * You are given an integer array nums and an integer k.
 * <p>
 * In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
 * <p>
 * Return the maximum number of operations you can perform on the array.
 */
public class MaxNumberOfKSumPairsLC1679 {

    // Using sorting and two pointer approach
    public void maxOperations() {

        int[] nums = {1, 2, 3, 4};
        int k = 5;

        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        while (i < j) {

            if (nums[i] + nums[j] == k) {
                count++;
                i++;
                j--;
            } else if (nums[i] + nums[j] < k) {
                i++;
            } else if (nums[i] + nums[j] > k) {
                j--;
            }
        }
        System.out.println("==>> number of operations :" + count);
    }


    // using hashmap
    public void maxOperations2() {

        int[] nums = {1, 2, 3, 4};
        int k = 5;

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {

            if (map.containsKey(k - num)) {
                count++;
                if (map.get(k - num) == 1)
                    map.remove((k - num));
                else
                    map.put(k-num, map.get(k - num) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        System.out.println("==>> Number of operations :" + count);
    }

}
