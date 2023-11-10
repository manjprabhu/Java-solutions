package com.mnj.java_solutions;

/**
 * iven an array of integers nums, return the number of good pairs.
 * <p>
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1,1,3]
 * Output: 4
 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 * Example 2:
 * <p>
 * Input: nums = [1,1,1,1]
 * Output: 6
 * Explanation: Each pair in the array are good.
 * Example 3:
 * <p>
 * Input: nums = [1,2,3]
 * Output: 0
 */


public class NumberOfGoodPairsLC1512 {

    public void numIdenticalPairs() {

        int[] nums = {1,2,3,1,1,3};

        int[] count = new int[102];

        for (int num : nums) {
            count[num]++;
        }

        int totalCount = 0;

        // Calculate total number of pairs possible
        for (int i : count) {
            totalCount += ((i) * (i-1))/2;
        }

        System.out.println("==> total number of pairs are .."+totalCount);
    }
}
