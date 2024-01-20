package com.mnj.java_solutions

class ElementMoreThan25 {
    fun findSpecialInteger() {
        val a = intArrayOf(1, 2, 2, 6, 6, 6, 6, 7)
        val quarter = a.size / 4
        for (i in 0 until a.size - quarter) {
            if (a[i] == a[i + quarter]) println("==>> Element " + a[i] + " appears more than %25 of time")
        }
    }
}
