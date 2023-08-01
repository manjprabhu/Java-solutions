package com.mnj.java_solutions.array;

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
