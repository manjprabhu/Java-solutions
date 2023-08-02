package com.mnj.java_solutions.binarysearch;

/**
 * Given an integer array arr of size N, sorted in ascending order (may contain duplicate values) and
 * a target value k. Now the array is rotated at some pivot point unknown to you.
 * Return True if k is present and otherwise, return False.
 **/
public class SearchInRotatedSortedArrayLC81 {

    public void searchElementInSortedRotatedArray() {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 3;

        int low = 0;
        int high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low )/2;

            if (nums[mid] == target) {
                result = mid;
                System.out.println("==>> Element is present and found at position:"+result);
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
