package com.mnj.java_solutions;

import java.util.Arrays;

public class ThreeSum {

    void tripletsWithGivenSum() {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        int sum = 0;


        Arrays.sort(nums);

        //after sorting {-4,-1,-1,0,1,2}


        for (int i = 0; i < nums.length - 2; i++) {

            int min = i + 1;
            int max = nums.length - 1;

            while (min < max) {
                int currentSum = nums[i] + nums[min] + nums[max];
                if (currentSum == 0) {
                    System.out.println("==>> Triplet is: (" + nums[i] + "," + nums[min] + "," + nums[max] + ")");
                    min++;
                    max--;
                } else if (currentSum > 0) {
                    min++;
                } else {
                    max--;
                }

            }
        }
    }
}
