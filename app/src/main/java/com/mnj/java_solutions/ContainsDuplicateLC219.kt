package com.mnj.java_solutions

import java.util.HashMap

class ContainsDuplicateLC219 {
    /* Given an integer array nums and an integer k, return true if there are two distinct indices i and j
    in the array such that nums[i] == nums[j] and abs(i - j) <= k.*/
    val isContainDuplicate: Unit
        get() {
            val nums = intArrayOf(1, 2, 3, 1)
            val k = 3
            val map = HashMap<Int, Int>()
            for (i in nums.indices) {
                if (!map.containsKey(nums[i])) {
                    map[nums[i]] = i
                } else {
                    val pastIndex = map[nums[i]]!!
                    if (Math.abs(pastIndex - i) <= k) {
                        println("==>> True")
                    } else {
                        map[nums[i]] = i
                    }
                }
            }
            println("==>> False")
        }
}