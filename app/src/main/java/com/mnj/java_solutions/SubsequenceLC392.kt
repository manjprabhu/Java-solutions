package com.mnj.java_solutions

class SubsequenceLC392 {
    val isSubSequence: Unit
        get() {
            val s = "abvc"
            val t = "ahbgdc"
            if (s.length == 0) {
                println("==>> $s is subsequence of $t")
                return
            }
            var t_pointer = 0
            var s_pointer = 0
            while (t_pointer < t.length) {
                if (s[s_pointer] == t[t_pointer]) {
                    s_pointer++
                    if (s_pointer == s.length) {
                        println("==>>> $s is subsequence of $t")
                        return
                    }
                }
                t_pointer++
            }
            println("==>>> $s is NOT a subsequence of $t")
        }
}
