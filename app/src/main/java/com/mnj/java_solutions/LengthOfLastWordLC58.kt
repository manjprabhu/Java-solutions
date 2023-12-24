package com.mnj.java_solutions

class LengthOfLastWordLC58 {
    fun lengthOfLastWord() {
        val str = "    fly me   to   the moon  "
        var count = 0
        for (i in str.length - 1 downTo 0) {
            val c = str[i]
            if (c != ' ') {
                count++
            } else {
                if (count > 0) {
                    println("==>> Length of last word :$count")
                    return
                }
            }
        }
    }
}