package com.mnj.java_solutions.array;

public class ConcatenationOfArrayLC1929 {

    public void concat() {
        int[] nums = {1, 2, 3};

        int res[] = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
            res[i + nums.length] = nums[i];
        }

        for (int i : res) {
            System.out.println("==>> :" + i);
        }
    }
}
