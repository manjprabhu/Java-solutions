package com.mnj.java_solutions.slidingwindow;

public class MaximumSumSubarrayOfSizeK {

    public void maximumSumSubArray() {

        int n = 7;
        int k = 3;
        int[] arr = {1, 5, 4, 2, 9, 9, 9};

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int i = 0;
        int j = 0;

        while (j < n) {
            currSum = currSum + arr[j];
            //Increment j until window size is equal to k
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {

                if (currSum > maxSum)
                    maxSum = currSum;

                currSum = currSum - arr[i];
                i++;
                j++;
            }
        }
        System.out.println("==>> Max sum subarray of size K is: " + maxSum);
    }
}
