package com.mnj.java_solutions.string

import java.util.*

class ShuffleStringLC1528 {
    fun restoreString() {
        val str = "abc"
        val position = intArrayOf(0, 1, 2)
        val map = TreeMap<Int, Char>()
        for (i in position.indices) {
            map[position[i]] = str[i]
        }
        var result = ""
        for (c in map.values) {
            result = result + c
        }
        println("==>> result string is : $result")
    }
}