package com.mnj.java_solutions

import java.util.*

/**
 * Given an array of integers arr, replace each element with its rank.
 *
 * The rank represents how large the element is. The rank has the following rules:
 *
 * Rank is an integer starting from 1.
 * The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
 * Rank should be as small as possible.
 *
 * Input: arr = [40,10,20,30]
 * Output: [4,1,2,3]
 * Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.
 *
 * Input: arr = [37,12,28,9,100,56,80,5,12]
 * Output: [5,3,4,2,8,6,7,1,3]
 */
class RankTransformOfAnArrayLC1331 {
    fun rankTransformAnArray() {
        val arr = intArrayOf(40, 10, 20, 30)
        val map = TreeMap<Int, Int>()
        val result = IntArray(arr.size)
        for (j in arr) {
            map[j] = 0
        }
        var rank = 1
        for ((key) in map) {
            map[key] = rank++
        }
        var index = 0
        for (i in arr) {
            result[index++] = map[i]!!
        }
        for (i in result) println("==>> Index:$i")
    }
}