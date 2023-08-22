package com.mnj.java_solutions.array;

/**
 * You are given a 0-indexed integer array nums of even length consisting of an EQUAL number of positive and negative integers.
 * <p>
 * You should rearrange the elements of nums such that the modified array follows the given conditions:
 * <p>
 * Every consecutive pair of integers have opposite signs.
 * For all integers with the same sign, the order in which they were present in nums is preserved.
 * The rearranged array begins with a positive integer.
 * Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
 * <p>
 * Input: nums = [3,1,-2,-5,2,-4]
 * Output: [3,-2,1,-5,2,-4]
 * Explanation:
 * The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
 * The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
 * Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.
 **/
public class RearrangeArrayElementsBySignLC2149 {

    public void rearrangeArray() {
        int[] nums = {3, 1, -2, -5, 2, -4};
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

        int i = 0;
        int j = 0;
        int index = 0;

        while (i < pos.length && j < neg.length) {
            nums[index++] = pos[i];
            i++;
            nums[index++] = neg[j];
            j++;
        }
        for (int x : nums)
            System.out.println("==>> " + x);
    }

    public void rearrangeArray2() {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int posIndex = 0;
        int negIndex = 1;

        int[] result = new int[nums.length];

        for (int num : nums) {
            if (num < 0) {
                result[negIndex] = num;
                negIndex = negIndex + 2;
            } else {
                result[posIndex] = num;
                posIndex = posIndex + 2;
            }
        }

        for (int x : result)
            System.out.println("==>> : " + x);
    }
}
