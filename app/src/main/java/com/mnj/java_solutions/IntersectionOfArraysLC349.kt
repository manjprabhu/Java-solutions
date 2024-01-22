package com.mnj.java_solutions

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 *
 * Each element in the result must be unique and you may return the result in any order.
 */
class IntersectionOfArraysLC349 {
    fun intersection() {
        val nums1 = intArrayOf(4, 9, 5)
        val nums2 = intArrayOf(9, 4, 9, 8, 4)
        val set = HashSet<Int>()
        val intersect = HashSet<Int>()
        for (num in nums1) {
            set.add(num)
        }
        for (num in nums2) {
            if (set.contains(num)) {
                intersect.add(num)
            }
        }
        val ans = IntArray(intersect.size)
        var index = 0
        for (num in intersect) ans[index++] = num
    }
}
