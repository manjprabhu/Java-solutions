package com.mnj.java_solutions;

public class NumberOfElementSmallerThanCurrentLC1365 {

    public void smallerNumbersThanCurrent() {
        int[] nums = {6, 5, 4, 8};

        int[] result = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] < nums[i] && i != j) {
                    count++;
                }
            }
            result[i] = count;
            count = 0;
        }

        for (int num : result) {
            System.out.println("==>> Result is :" + num);
        }
    }

    public void smallerNumbersThanCurrent2() {
        int[] nums = {8, 1, 2, 2, 3};
        int[] result = new int[nums.length];

        int[] count = new int[100];

        //Get the frequency of each element
        for (int num : nums) {
            count[num]++;
        }

        //Count the smaller number for each element

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                result[i] = 0;
            else
                result[i] = count[nums[i] - 1];
        }

        for (int num : result) {
            System.out.println("==>> Result is :" + num);
        }
    }
}
