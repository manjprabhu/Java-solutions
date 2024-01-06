package com.mnj.java_solutions

import java.util.*

class DifferenceBetween2ArraysLC2215 {
    fun findDifference() {
        val nums1 = intArrayOf(1, 2, 3)
        val nums2 = intArrayOf(2, 4, 6)
        val set1 = HashSet<Int>()
        val set2 = HashSet<Int>()
        for (num in nums1) {
            set1.add(num)
        }
        for (num in nums2) {
            set2.add(num)
        }
        val list1 = ArrayList<Int>()
        for (num in set1) {
            if (!set2.contains(num)) list1.add(num)
        }
        val list2 = ArrayList<Int>()
        for (num in set2) {
            if (!set1.contains(num)) list2.add(num)
        }
        val result = Arrays.asList<List<Int>>(list1, list2)
    }
}