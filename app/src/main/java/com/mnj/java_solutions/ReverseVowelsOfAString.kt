package com.mnj.java_solutions

class ReverseVowelsOfAString {
    fun reverseVowels() {
        val str = "leetcode"
        val ch = str.toCharArray()
        var max = ch.size - 1
        var min = 0
        while (min < max) {
            if (!isVowel(ch[min])) {
                min++
            } else if (!isVowel(ch[max])) {
                max--
            } else {
                val x = ch[min]
                ch[min] = ch[max]
                ch[max] = x
                min++
                max--
            }
        }
        println("==>> Reverse :" + String(ch))
    }

    private fun isVowel(c: Char): Boolean {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U'
    }
}