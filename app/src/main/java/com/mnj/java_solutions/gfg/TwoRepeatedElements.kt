package com.mnj.java_solutions.gfg

class TwoRepeatedElements {
    fun twoRepeatedElement() {
        val a = intArrayOf(1, 2, 1, 5, 4, 3, 5)
        val count = IntArray(100000)
        val res = IntArray(2)
        var m = 0
        for (i in a) {
            count[i]++
        }
        for (i in count.indices) {
            if (count[i] >= 2) {
                res[m] = i
                m++
                println("==>> Element is:$i")
            }
        }
        for (x in res) println("==>> x:$x")
    }
}