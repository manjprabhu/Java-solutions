package com.mnj.java_solutions.gfg;

/**
 * Given an unsorted integer array nums, return the smallest missing positive integer.
 *
 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,0]
 * Output: 3
 * Explanation: The numbers in the range [1,2] are all in the array.
 *
 * Example 2:
 *
 * Input: nums = [3,4,-1,1]
 * Output: 2
 * Explanation: 1 is in the array but 2 is missing.
 *
 * Example 3:
 *
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 * Explanation: The smallest positive integer 1 is missing.
 *
 * **/
public class SmallestPositiveMissingNumberLC41 {

    public void missingNumberBruteForce() {
        int[] arr = {0, -10, 1, -3, 2};
        int n = 5;

        boolean[] visit = new boolean[n + 1];
        for (int j : arr) {
            if (j > 0 && j <= n) {
                System.out.println("==>> -----------------------------------");
                visit[j] = true;
            }
        }

        for (int i = 1; i < visit.length; i++) {
            System.out.println("==>> Visit : " + visit[i]);
        }

        for (int i = 1; i < visit.length; i++) {
            if (!visit[i]) {
                System.out.println("==>> Smallest missing +ve number is :" + i);
                return;
            }
        }
    }

    public void missingNumber() {
        int[] arr = {0, -10, 1, -3, 2};
        int n = 5;

        for (int i = 0; i < arr.length; i++) {

            while (arr[i] > 0 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i=0;i<n;i++) {
            if(arr[i] !=i+1) {
                System.out.println("==>> Smallest missing element:" + (i + 1));
                return;
            }
        }
        System.out.println("==>> Smallest missing element:"+ (n+1));
    }
}
