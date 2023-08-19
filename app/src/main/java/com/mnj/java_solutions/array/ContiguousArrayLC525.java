package com.mnj.java_solutions.array;

import java.util.HashMap;

/**
 * Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
 **/
public class ContiguousArrayLC525 {

    public void findMaxLength() {
        int[] arr = {0, 1, 0};
        int max = Integer.MIN_VALUE;

        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {

            //If current element is 1 then add that 1 to current sum else if current element is zero subtract 1 from prefix sum
            // when prefix sum is zero then , there is exists a subarray with equal number of 0's and 1's. ( here we are assuming 0 as -1)
            if (arr[i] == 1)
                prefixSum = prefixSum + arr[i];
            else
                prefixSum = prefixSum - 1;

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
        System.out.println("==>>> Length of maximum subarray that contains equal number of 0's and 1's is :" + max);
    }
}
