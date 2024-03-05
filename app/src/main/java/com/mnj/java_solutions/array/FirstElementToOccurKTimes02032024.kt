package com.mnj.java_solutions.array

class FirstElementToOccurKTimes02032024 {

    fun firstElementKTime() {
        val arr = intArrayOf(1, 7, 4, 3, 4, 8, 7)
        val k = 2
        val map = HashMap<Int,Int>()
        for (i in arr) {
            map[i] = map.getOrDefault(i, 0) + 1
            if (map[i] == k) {
                println("==>> Element is : $i")
                return
            }
        }
    }
}