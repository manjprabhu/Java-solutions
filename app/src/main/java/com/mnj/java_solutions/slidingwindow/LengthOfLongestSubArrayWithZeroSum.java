package com.mnj.java_solutions.slidingwindow;

import java.util.HashMap;

public class LengthOfLongestSubArrayWithZeroSum {

    public void longestSubArrayWithSumZero() {
        int[] a = {9, -3, 3, -1, 6, -5};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) { // start index

            for (int j = i; j < a.length; j++) { // end index
                int sum = 0;

                //Generate sum of all the elements of sub array = a[i...j]
                for (int m = i; m <= j; m++) {
                    sum = sum + a[m];
                }
                if (sum == 0) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        System.out.println("==>> Length of the longest subArray with sum 0 is :" + max);
    }

    public void longestSubArrayWithSumZero2() {
        int[] a = {9, -3, 3, -1, 6, -5};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) { // Start index of the sub array
            int sum = 0;
            for (int j = i; j < a.length; j++) { // end index of the sub array and current element

                // add the current element to the sub array a[i...j-1]
                sum = sum + a[j];
                if (sum == 0) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        System.out.println("==>>2  Length of the longest subArray with sum 0 is :" + max);
    }

    public void longestSubArrayWithSumZero3() {
        int[] a = {9, -3, 3, -1, 6, -5};
        int max = Integer.MIN_VALUE;

        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;

        for (int i = 0; i < a.length; i++) {
            prefixSum = prefixSum + a[i];

            if (prefixSum == 0) {
                max = Math.max(max, i + 1);
            }

            //Calculate the length and update max length
            if (map.containsKey(prefixSum)) {
                int len = i - map.get(prefixSum);
                max = Math.max(max, len);
            }

            //Finally, update the map checking the conditions:
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        System.out.println("==>>3  Length of the longest subArray with sum 0 is :" + max);
    }

}
