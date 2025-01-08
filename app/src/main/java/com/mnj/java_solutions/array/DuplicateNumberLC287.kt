package com.mnj.java_solutions.array

import java.util.*

/**
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n]
 * inclusive.
 *
 * There is only one repeated number in nums, return this repeated number.
 *
 * You must solve the problem without modifying the array nums and uses only constant extra space.
 */
class DuplicateNumberLC287 {
    fun duplicateNumber() {
        val num = intArrayOf(1, 7, 3, 4, 3, 3, 5)
        for (i in num.indices) {
            for (j in num.indices) {
                if (num[i] == num[j] && i != j) {
                    println("==>> Duplicate element is :" + num[i])
                    return
                }
            }
        }
    }

    fun duplicateNumber2() {
        val num = intArrayOf(1, 7, 3, 4, 3, 3, 5)
        val set = HashSet<Int>()
        for (j in num) {
            if (!set.contains(j)) {
                set.add(j)
            } else {
                println("==>> Duplicate element is :$j")
                return
            }
        }
    }

    fun duplicateNumber3() {
        val num = intArrayOf(1, 7, 3, 4, 3, 3, 5)
        Arrays.sort(num)
        for (i in 1 until num.size) {
            if (num[i] == num[i - 1]) {
                println("==>> Duplicate Element is :" + num[i])
                return
            }
        }
    }

    //Similar approach as linked list cycle detection.
    fun duplicateNumber4() {
        val nums = intArrayOf(1, 3, 4, 2, 2)

        //Find the loop in array ( same as linked list loop)
        var slow = 0
        var fast = 0
        do {
            slow = nums[slow]
            fast = nums[nums[fast]]
        } while (slow != fast)

        // As soon as they meet, move both
        // pointers at same speed until they
        // meet again
        slow = 0
        while (slow != fast) {
            slow = nums[slow]
            fast = nums[fast]
        }
        println("==>> Duplicate number is :$slow")
    }
}