package com.mnj.java_solutions.binarysearch;

public class SearchInRotatedSortedArrayLC33 {

    public void searchElementInSortedRotatedArray1() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 8;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("==>> Element is present at: " + index);
    }


    /*
    * First, we identify the sorted half of the array.
    Once found, we determine if the target is located within this sorted half.
    If not, we eliminate that half from further consideration.
    Conversely, if the target does exist in the sorted half, we eliminate the other half.
    * */

    public void searchElementInSortedRotatedArray2() {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;

        int low = 0;
        int high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == nums[mid]) {
                result = mid;
                break;
            }
            // Here either left half of the array is sorted or right half is sorted.

            //For left half to be sorted , first element in left half shall be smaller then equal to mid element.
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

        System.out.println("==>> Element is present at:: " + result);

    }
}
