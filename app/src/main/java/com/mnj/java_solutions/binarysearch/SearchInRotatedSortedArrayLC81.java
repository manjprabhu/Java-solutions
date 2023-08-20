package com.mnj.java_solutions.binarysearch;

/**
 * There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
 * <p>
 * Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
 * <p>
 * For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
 * <p>
 * Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.
 * <p>
 * Given an integer array arr of size N, sorted in ascending order (may contain duplicate values) and
 * a target value k. Now the array is rotated at some pivot point unknown to you.
 * Return True if k is present and otherwise, return False.
 * <p>
 * Input: nums = [2,5,6,0,0,1,2], target = 0
 * Output: true
 **/
public class SearchInRotatedSortedArrayLC81 {

    public void searchElementInSortedRotatedArray() {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 3;

        int low = 0;
        int high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                result = mid;
                System.out.println("==>> Element is present and found at position:" + result);
                return;
            }

            /*
            *
            * How to handle the edge case arr[low] = arr[mid] = arr[high]:

            In the algorithm, we first check if arr[mid] is the target before identifying the sorted half.
            *  If arr[mid] is not our target, we encounter this edge case.
            *  In this scenario, since arr[mid] = arr[low] = arr[high],
            * it means that neither arr[low] nor arr[high] can be the target.
            *  To handle this edge case, we simply remove arr[low] and arr[high] from our search space,
            * without affecting the original algorithm.

            To eliminate elements arr[low] and arr[high],
            * we can achieve this by simply incrementing the low pointer and decrementing the high pointer by one step.
            *  We will continue this process until the condition arr[low] = arr[mid] = arr[high] is no longer satisfied.
            * */

            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }

            if (nums[low] <= nums[mid]) {

                //If below condition is true to then target element lies on left half
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
                // Now right half is sorted.
            } else {
                //If below condition is true to then target element lies on right half
                if (nums[mid] <= target && target < nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        System.out.println("==>> Element is NOT present...");

    }
}
