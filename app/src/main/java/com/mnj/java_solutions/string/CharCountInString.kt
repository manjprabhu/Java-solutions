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


    fun charCountSolutionTwo() {
        val str = "helloleetcode"
        val map = HashMap<Char, Int>()

        for (ele in str)
            map[ele] = map.getOrDefault(ele, 0) + 1

        for (ele in map) {
            val cnt = ele.value
            println("==>>2  Element ${ele.key} appears $cnt times")
        }
    }
}