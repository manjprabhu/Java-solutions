package com.mnj.java_solutions.binarysearch;

public class KthMissingPositiveNumber {

    /**
     * Input: arr = [2,3,4,7,11], k = 5
     * Output: 9
     * Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
     * <p>
     * Input: arr = [1,2,3,4], k = 2
     * Output: 6
     * Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
     */
    public void findKthPositive() {
        int[] arr = {1, 2, 3, 4};
        int k = 2;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k)
                k++;
            else
                break;
        }
        System.out.println("==>> Kth missing element is :" + k);
    }

    public void findKthPositive2() {
        int[] arr = {32,59,77};
        int k = 1;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("==>> Kth missing positive element is :" + (k+high+1));
    }
}
