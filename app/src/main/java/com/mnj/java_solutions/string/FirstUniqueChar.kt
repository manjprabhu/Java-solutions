package com.mnj.java_solutions.string

class FirstUniqueChar {

    fun firstUniqueCharSolutionOne() {
        val input = "loveleetcode"
        val map = HashMap<Char, Int>()

        for (ch in input) {
            map.put(ch, map.getOrDefault(ch, 0) + 1)
        }

        for (ele in input) {
            if (map.get(ele) == 1) {
                println("First unique char is ${map.get(ele)}")
                return
            }
        }
    }
}