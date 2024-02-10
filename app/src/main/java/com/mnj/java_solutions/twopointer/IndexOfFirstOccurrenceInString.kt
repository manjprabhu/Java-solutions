package com.mnj.java_solutions.twopointer

class IndexOfFirstOccurrenceInString {
    fun strStr() {
        val hayStack = "sadbutsad"
        val needle = "sad"
        val l = needle.length
        for (i in 0 until hayStack.length - needle.length + 1) {
            if (hayStack[i] == needle[0]) {
                if (hayStack.substring(i, l) == needle) {
                    println("==>> Substring index is :$i")
                    return
                }
            }
        }
        println("==>> No substring present")
    }

    fun strStr2() {
        val haystack = "sadbutsadg"
        val needle = "sadg"
        var i = 0
        var j = 0
        var start = 0
        val n1 = haystack.length
        val n2 = needle.length
        while (i < n1 && j < n2) {
            if (haystack[i] == needle[j]) {
                if (i - start + 1 == n2) {
                    println("==>> Start of substring :$start")
                    return
                }
                i++
                j++
            } else {
                j = 0
                start++
                i = start
            }
        }
        println("==>> Substring does not exists")
    }
}
