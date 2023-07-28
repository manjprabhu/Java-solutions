package com.mnj.java_solutions.array;

public class SingleNumber136 {

    public void singleNumber() {
        int[] nums = {4, 1, 2, 1, 2, 4, 7};

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j] && i != j)
                    continue;
                else {
                    System.out.println("==>> Single unique number is :" + nums[i]);
                    return;
                }
            }
        }
    }

    //Using bitwise operator XOR
    public void singleNumber2() {

        int[] nums = {1,2,3,4,4,3,2};
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
            // 1 XOR 2  XOR 3 XOR 4 XOR 4 XOR 3 XOR 2

            //4 XOR 4 = 0
            //3 XOR 3 = 0
           // 2 XOR 2 = 0
           // hence remaining element is 1
        }

        System.out.println("==>> Single unique number is :" + result);
    }
}
