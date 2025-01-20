package com.mnj.java_solutions.string

class FirstUniqueChar {

    fun firstUniqueCharSolutionOne() {
        val input = "loveleetcode"
        val map = HashMap<Char, Int>()

        for (ch in input) {
            map[ch] = map.getOrDefault(ch, 0) + 1
            //  map.put(ch, map.getOrDefault(ch, 0) + 1)
        }

        for (ele in input) {
            if (map[ele] == 1) {
                println("First unique char is $ele")
                return
            }
        }
    }

    fun firstUniqueCharSolutionTwo() {
        val input = "loveleetcode"
        val arr = IntArray(26)

        for (ele in input) {
            arr[ele - 'a']++
        }

        for (ele in input) {
            if (arr[ele - 'a'] == 1) {
                println("First unique char is $ele")
                return
            }
        }
    }
}