package com.mnj.java_solutions

class RansomNoteLC383 {
    fun canConstruct() {
        val magazine = "aaab"
        val ransom = "aaa"
        val count = IntArray(26)
        for (element in magazine) {
            count[element - 'a']++
        }
        for (i in ransom.indices) {
            count[ransom[i] - 'a']--
            if (count[ransom[i] - 'a'] < 0) {
                println("==>> False")
                return
            }
        }
        println("==>> True")
    }
}