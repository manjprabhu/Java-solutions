package com.mnj.java_solutions.slidingwindow;

/**
 * Given a binary array nums, you should delete one element from it.
 * <p>
 * Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.
 * <p>
 * Input: nums = [0,1,1,1,0,1,1,0,1]
 * Output: 5
 * Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
 **/
public class LongestSubarrayof1sAfterDeletingOneElementLC1493 {

    //Maintain a sliding window where there is at most one zero on it.
    public void longestSubarray() {
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};

        int zeroCount = 0;
        int start = 0;
        int end = 0;
        int max = Integer.MIN_VALUE;

        while (end < nums.length) {
            if (nums[end] == 0) {
                zeroCount++;
            }
            while (zeroCount > 1) {
                if (nums[start] == 0) {
                    zeroCount--;
                }
                start++;
            }
            max = Math.max(max, end - start);
            end++;
        }
        System.out.println("==>>   Length of longest subarray having only 1's : " + max);
    }
}
