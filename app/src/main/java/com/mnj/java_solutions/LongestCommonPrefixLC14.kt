package com.mnj.java_solutions

import java.util.Arrays

class LongestCommonPrefixLC14 {
    fun longestCommonPrefix() {
        val strs = arrayOf("flower", "flow", "flight")
        Arrays.sort(strs) // sort the aray
        val result = StringBuilder()
        val first = strs[0].toCharArray() // first string in sorted array
        val last = strs[strs.size - 1].toCharArray() // last word in sorted array
        for (i in first.indices) {
            if (first[i] != last[i]) {  // if first char of last and first string are not same then there is no common prefix
                break
            }
            result.append(first[i])
        }
        if (result.toString().isEmpty()) {
            println("==>> NO Common prefix exists")
        } else {
            println("==>> Common prefix is :$result")
        }
    }
}
