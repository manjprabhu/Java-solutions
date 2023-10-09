package com.mnj.java_solutions.array;

/**
 * You are given an array arr  of length N of 0's and 1's. Find the total number of subarrays of 0's
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 4
 * arr[] = {0, 0, 1, 0}
 * Output:
 * 4
 * Explanation:
 * Following are the subarrays of
 * length 1: {0}, {0}, {0} - 3
 * length 2: {0, 0} - 1
 * Total Subarrays: 3 + 1 = 4
 **/
public class NumberOfSubArraysOfZeros17032023 {

    public void noOfSubarrays() {

        int[] arr = {0, 0, 1, 0};
        int N = arr.length;
        long ans = 0;
        long cnt = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 0)
                cnt++;
            else {
                ans += (cnt + 1) * cnt / 2;
                cnt = 0;
            }
        }
        ans += (cnt + 1) * cnt / 2;
        System.out.println("==>> Number of subarrays of 0's :" + ans);
    }
}
