package com.mnj.java_solutions.array

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
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
 * only element with no duplicate number will remain and will be returned as ans.
 */
class SingleNumber136 {
    fun singleNumber() {
        val nums = intArrayOf(4, 1, 2, 1, 2, 4, 7)
        for (i in nums.indices) {
            for (j in nums.indices) {
                if (nums[i] == nums[j] && i != j) continue else {
                    println("==>> Single unique number is :" + nums[i])
                    return
                }
            }
        }
    }

    //Using bitwise operator XOR
    fun singleNumber2() {
        val nums = intArrayOf(1, 2, 3, 4, 4, 3, 2)
        var result = nums[0]
        for (i in 1 until nums.size) {
            result = result xor nums[i]
            // 1 XOR 2  XOR 3 XOR 4 XOR 4 XOR 3 XOR 2

            //4 XOR 4 = 0
            //3 XOR 3 = 0
            // 2 XOR 2 = 0
            // hence remaining element is 1
        }
        println("==>> Single unique number is :$result")
    }
}