package com.mnj.java_solutions

class BalancedStringLC1221 {
    fun balancedStringSplit() {
        val str = "RLRRLLRLRL"
        var result = 0
        var balance = 0
        for (c in str.toCharArray()) {
            if (c == 'R') balance++ else if (c == 'L') balance--
            if (balance == 0) result++
        }
        println("==>> maximum balanced substring are  :$result")
    }
}