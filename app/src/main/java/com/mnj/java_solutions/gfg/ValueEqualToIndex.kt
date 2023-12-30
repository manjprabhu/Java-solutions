package com.mnj.java_solutions.gfg

class ValueEqualToIndex {
    fun valuesEqualToIndex() {
        val a = intArrayOf(15, 2, 3, 12, 5)
        for (i in a.indices) {
            if (a[i] == i + 1) {
                println("==>> Value and Index equal :" + a[i])
            }
        }
    }
}