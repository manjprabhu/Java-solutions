package com.mnj.java_solutions.array;

/***
 *
 * Given an array of integers arr, return true if we can partition the array into three non-empty parts with equal sums.
 *
 * Formally, we can partition the array if we can find indexes i + 1 < j with (arr[0] + arr[1] + ... + arr[i] == arr[i + 1] + arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ... + arr[arr.length - 1])
 *
 * Example 1:
 *
 * Input: arr = [0,2,1,-6,6,-7,9,1,2,0,1]
 * Output: true
 * Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
 * Example 2:
 *
 * Input: arr = [0,2,1,-6,6,7,9,-1,2,0,1]
 * Output: false
 * Example 3:
 *
 * Input: arr = [3,3,6,5,-2,2,5,1,-9,4]
 * Output: true
 * Explanation: 3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
 *  **/
public class PartitionArrayIntoThreePartsWithEqualSumLC1013 {
    public void canThreePartsEqualSum() {
        int[] nums = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};

        int sum = 0;
        for (int a : nums)
            sum = sum + a;

//The key insight is that if the total sum of the array is not divisible by 3,
// then it is impossible to divide it into three parts with equal sums
        if (sum % 3 != 0) {
            System.out.println("==>> False");
            return;
        }

        int target = sum / 3;
        int prefixSum = 0;
        int count = 0;

        //Note that we need to stop the loop at the second-to-last element to ensure that there is at least one element left for the third part of the array.
        // This is because the problem requires the array to be divided into three parts.
        for (int i = 0; i < nums.length - 1; i++) {
            prefixSum = prefixSum + nums[i];

            if (prefixSum == target) {
                count++;
                prefixSum = 0;
                if (count == 2) {
                    System.out.println("==>> True");
                    return;
                }
            }
        }
        System.out.println("==>> False");
    }
}
