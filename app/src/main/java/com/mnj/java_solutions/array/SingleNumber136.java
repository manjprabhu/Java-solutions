package com.mnj.java_solutions.array;
/**
 *
 * Using Bit Manipulation -
 *
 * As we know XOR operation with 0 gives the same number
 * i.e, a XOR 0 = a
 * eg, for decimal no. 2=> 2 XOR 0 = 2
 * in binary, 010 XOR 000 = 010
 *
 * Also we know that , XOR operation with same number gives 0
 * i.e, a XOR a = 0
 * eg, 2 XOR 2 = 0
 * in binary, 010 XOR 010 = 000
 *
 * XOR is associative (like sum)
 * i.e, (2 XOR 3) XOR 4 = 2 XOR (3 XOR 4), So the order doesn't matter in performing XOR operation.
 * eg, 2^3^4^6 = 3^2^6^4 = 4^2^6^3 ......
 *
 * So, using these three properties of XOR , we will solve the question.
 * we will take ans variable with 0 as initial value. And then for each element i in array,
 * we will perform the XOR operation of the element with 0, ans will become 0
 * if the same number is found (as a XOR a = 0) and so after the completion of the loop,
 * only element with no duplicate number will remain and will be returned as ans.**/

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
