package com.mnj.java_solutions.gfg

import java.util.HashMap

class FrequencyGame {
    fun LargeButMinFreq() {
        val arr = intArrayOf(2, 2, 5, 50, 1)
        //        2,2;
//        5,1;
//        50,1;
//        1,1l
        val map = HashMap<Int, Int>()
        var min_value = Int.MAX_VALUE
        var ans = Int.MIN_VALUE
        val i = 0
        for (ele in arr) {
            map[ele] = map.getOrDefault(ele, 0) + 1
        }
        for ((key, value) in map) {
            if (value <= min_value) {
                ans = Math.max(ans, key)
                min_value = value
            }
        }
        println("==>> LargeButMinFreq :$ans")
    }
}