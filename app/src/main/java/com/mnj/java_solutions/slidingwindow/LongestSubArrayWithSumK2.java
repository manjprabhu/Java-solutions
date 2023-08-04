package com.mnj.java_solutions.slidingwindow;

import java.util.HashMap;

/**
 * Longest Sub array with sum K | [Postives and Negatives]
 * Given an array and a sum k, we need to print the length of the longest sub array that sums to k.
 **/
public class LongestSubArrayWithSumK2 {

    public void longestSubArrayWithSumK() {
        int[] a = {-1, 1, 1};
        long k = 1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) { // start index

            for (int j = i; j < a.length; j++) { // end index
                int sum = 0;

                //Generate sum of all the elements of sub array = a[i...j]
                for (int m = i; m <= j; m++) {
                    sum = sum + a[m];
                }
                if (sum == k) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        System.out.println("==>> Length of the longest subArray with sum k is :" + max);
    }

    public void longestSubArrayWithSumK2() {
        int[] a = {-1, 1, 1};
        long k = 1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) { // Start index of the sub array
            int sum = 0;
            for (int j = i; j < a.length; j++) { // end index of the subarray and current element

                // add the current element to the sub array a[i...j-1]
                sum = sum + a[j];
                if (sum == k) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        System.out.println("==>> 2 Length of the longest subArray with sum k is : " + max);
    }

    public void longestSubArrayWithSumK3() {
        int[] a = {-1, 1, 1};
        long k = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            prefixSum = prefixSum + a[i];

            if (prefixSum == k) {
                max = Math.max(max, i + 1);
            }

            //                                prefixsum
            // <-------------------------------------------------------------------------i>
            // <-----------------------------------------------><------------------------->
            // <          prefix-k                             >       k                  >


            //Calculate the length and update max length
            if (map.containsKey(prefixSum - k)) {
                int len = i - map.get(prefixSum - k);
                max = Math.max(max, len);
            }

            //Finally, update the map checking the conditions:
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        System.out.println("==>>3 Length of the longest subArray with sum k is :" + max);
    }


    public void longestSubArrayWithSumK4() {
        int[] a = {-1, 1, 1};
        long k = 1;
        int n = a.length;
        int maxLen = 0;
        int i = 0;
        int j = 0;

        int sum = 0;
        while (j < n) {
            sum = sum + a[j];
            if (sum == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            } else if (sum > k) {
                while (i <= j) {
                    sum = sum - a[i];
                    i++;
                }
            }
            j++;
        }
        System.out.println("==>>4 Length of the longest subArray with sum k is :" + maxLen);
    }
}
