package com.mnj.java_solutions.array

import java.util.ArrayList
import java.util.HashMap

class MostFrequentElementsLC347 {
    fun topKFrequent() {
        val arr = intArrayOf(1, 1, 1, 2, 2, 3)
        val k = 2
        val map = HashMap<Int, Int>()
        val bucket: Array<MutableList<Int>?> = arrayOfNulls<MutableList<*>?>(arr.size + 1)
        for (j in arr) {
            map[j] = map.getOrDefault(j, 0) + 1
        }
        for (key in map.keys) {
            val frequency = map[key]!!

            // each bucket item itself is an array
            if (bucket[frequency] == null) {
                bucket[frequency] = ArrayList()
            }
            bucket[frequency]!!.add(key)
        }
        val result = IntArray(k)
        var counter = 0
        var pos = bucket.size - 1
        while (pos >= 0 && counter < k) {
            if (bucket[pos] != null) {
                for (i in bucket[pos]!!) {
                    result[counter++] = i
                }
            }
            pos--
        }
        for (i in result) {
            println("==>> :$i")
        }
    }
}