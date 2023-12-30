package com.mnj.java_solutions.gfg

import java.util.HashMap
import java.util.HashSet

class UniqueNumberOfOccurrences {
    fun uniqueNumberOfOccurrences() {
        val a = intArrayOf(1, 1, 2, 5, 5) //{2, 2, 5, 10, 1, 2, 10, 5, 10, 2};
        val map = HashMap<Int, Int>()
        for (num in a) {
            map[num] = map.getOrDefault(num, 0) + 1
        }
        val set = HashSet(map.values)
        if (set.size == map.size) println("==>> Array contains elements in unique frequency") else println(
            "==>> Array DOES NOT contains elements in unique frequency"
        )
    }
}