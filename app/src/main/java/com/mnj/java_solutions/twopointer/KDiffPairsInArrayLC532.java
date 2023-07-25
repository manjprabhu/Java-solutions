package com.mnj.java_solutions.twopointer;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer k,
 * return the number of unique k-diff pairs in the array.
 * <p>
 * A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:
 * <p>
 * 0 <= i, j < nums.length
 * i != j
 * |nums[i] - nums[j]| == k
 */

public class KDiffPairsInArrayLC532 {

    public void findPairs() {
        int[] nums = {1,2,3,4,5};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if((map.containsKey(entry.getKey()+k) && k!=0) || (k==0 && entry.getValue()>1))
                count++;
        }

        System.out.println("==>> Number of Pairs :"+count);
    }

}
