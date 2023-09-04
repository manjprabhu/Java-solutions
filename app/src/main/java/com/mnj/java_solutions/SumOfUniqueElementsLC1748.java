package com.mnj.java_solutions;

/**
 * You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
 *
 * Return the sum of all the unique elements of nums.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,2]
 * Output: 4
 * Explanation: The unique elements are [1,3], and the sum is 4.
 * Example 2:
 *
 * Input: nums = [1,1,1,1,1]
 * Output: 0
 * Explanation: There are no unique elements, and the sum is 0.
 *
 * **/
public class SumOfUniqueElementsLC1748 {

    void sumOfUniqueElements() {
        int[] a = {1, 2, 3, 4, 4, 5};

        int[] count = new int[101];
        int result = 0;

        for (int j : a) {
            count[j]++;
        }
        for (int i = 0; i < 101; i++) {
            if (count[i] == 1)
                result = result + i;
        }
        System.out.println("==>> Sum is:" + result);
    }
}
