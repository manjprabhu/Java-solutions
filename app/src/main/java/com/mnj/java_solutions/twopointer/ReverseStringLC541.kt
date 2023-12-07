package com.mnj.java_solutions.twopointer

class ReverseStringLC541 {
    /**
     * Given a string s and an integer k, reverse the first k characters for every 2k characters
     * counting from the start of the string.
     *
     *
     * If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters,
     * then reverse the first k characters and leave the other as original.
     *
     *
     * Example 1:
     *
     *
     * Input: s = "abcdefg", k = 2
     * Output: "bacdfeg"
     * Example 2:
     *
     *
     * Input: s = "abcd", k = 2
     * Output: "bacd"
     */
    fun reverse() {
        val str = "abcd"
        val k = 2
        val ch = str.toCharArray()
        var i = 0
        while (i < str.length) {
            var start = i
            var end = Math.min(i + k - 1, str.length - 1)
            while (start < end) {
                val temp = ch[start]
                ch[start++] = ch[end]
                ch[end--] = temp
            }
            i += 2 * k
        }
        println("==>> Reverse string is  :" + String(ch))
    }
}