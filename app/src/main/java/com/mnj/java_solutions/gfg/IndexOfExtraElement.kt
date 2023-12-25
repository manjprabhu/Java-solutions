package com.mnj.java_solutions.gfg

class IndexOfExtraElement {
    fun indexOfExtraElement() {
        val a = intArrayOf(3, 5, 7, 9, 11, 13)
        val b = intArrayOf(3, 5, 7, 11, 13)
        var i = 0
        var j = 0
        while (i < a.size && j < b.size) {
            if (a[i] != b[j]) {
                println("==>> Index of extra element is :$i")
                return
            } else {
                i++
                j++
            }
        }
    }
}