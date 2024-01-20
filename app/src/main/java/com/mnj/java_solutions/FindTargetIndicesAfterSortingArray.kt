package com.mnj.java_solutions

import java.util.Arrays

class FindTargetIndicesAfterSortingArray {
    val indices: Unit
        get() {
            val nums = intArrayOf(1, 2, 5, 2, 3)
            val target = 2
            Arrays.sort(nums)
            for (i in nums.indices) {
                if (nums[i] == target) {
                    println("==>> Indices of element :$target is:$i")
                }
            }
        }
}
