package com.mnj.java_solutions.string

class CharCountInString {

    fun charCountSolutionOne() {

        val str = "helloleetcode"
        val countArray = IntArray(26)

        for (ele in str)
            countArray[ele - 'a']++

        for (ele in str) {
            val cnt = countArray[ele - 'a']
            println("==>> Element $ele appears $cnt times")
        }
    }
}