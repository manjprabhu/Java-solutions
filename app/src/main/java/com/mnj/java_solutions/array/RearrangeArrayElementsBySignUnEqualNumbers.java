package com.mnj.java_solutions.array;

/**
 * You are given a 0-indexed integer array nums of even length consisting of an UNEQUAL number of positive and negative integers.
 * <p>
 * You should rearrange the elements of nums such that the modified array follows the given conditions:
 * <p>
 * Every consecutive pair of integers have opposite signs.
 * For all integers with the same sign, the order in which they were present in nums is preserved.
 * The rearranged array begins with a positive integer.
 * Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
 * <p>
 * Input: nums = [-1,2,3,4,-3,1]
 * Output: [2,-1,3,-3,4,1]
 **/
public class RearrangeArrayElementsBySignUnEqualNumbers {

    public void rearrangeArray() {
        int[] nums = {-1, 2, 3, 4, -3, 1};
        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];
        int p = 0;
        int n = 0;
        for (int num : nums) {
            if (num > 0)
                pos[p++] = num;
            else
                neg[n++] = num;
        }

        // If +ve numbers are more than -ve numbers.
        if (pos.length > neg.length) {
            for (int i = 0; i < neg.length * 2; i++) {
                nums[2 * i] = pos[i];
                nums[2 * i + 1] = neg[i];
            }
            //Fill the rest of +ve numbers
            int index = neg.length * 2;
            for (int i = index; i < pos.length; i++) {
                nums[index] = pos[i];
                index++;
            }
        } else {// more of -ve numbers  ins array
            // so first fill the equal number of +ve & -ve numbers.
            for (int i = 0; i < pos.length * 2; i++) {
                nums[2 * i] = pos[i];
                nums[2 * i + 1] = neg[i];
            }
            //Fill the rest of -ve numbers
            int index = pos.length * 2;
            for (int i = index; i < neg.length; i++) {
                nums[index] = neg[i];
                index++;
            }
        }
        for (int x : nums)
            System.out.println("==>> " + x);
    }
}
