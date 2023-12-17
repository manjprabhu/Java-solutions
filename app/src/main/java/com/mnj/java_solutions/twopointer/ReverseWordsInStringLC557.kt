package com.mnj.java_solutions.twopointer

import java.lang.StringBuilder

class ReverseWordsInStringLC557 {
    fun reverse() {
        val str = "hello this testing"
        val s = str.split(" ").toTypedArray()
        val result = StringBuilder()
        for (value in s) {
            result.append(StringBuilder(value).reverse()).append(" ")
        }
        println("==>> Reverse words :$result")
    }

    fun reverseTwoPointer() {
        val str = "hello this testing"
        val ch = str.toCharArray()
        var left = 0
        var right: Int
        val length = str.length
        for (i in 0 until length) {
            if (ch[i] == ' ' || i == length - 1) {

                // right is the index before the space
                // if str[i] is space, then we want to reverse str[l : i - 1]
                // if str[i] is the last character, then we want to reverse str[l : i]

                //set the right pointer
                // if i is at last place then set right  to i
                // if i is at a space then set right  to i-1
                right = if (i == length - 1) i else i - 1

                // swap the character
                // e.g. s = `Let's` where l is 0 and r is 4
                // Let's -> set'L -> s'teL
                while (left < right) {
                    val tmp = ch[left]
                    ch[left] = ch[right]
                    ch[right] = tmp
                    left++
                    right--
                }
                // update left pointer which is i + 1
                // i.e. the first index of the next word if applicable
                left = i + 1
            }
        }
        println("==>> Reverse words  in string: " + String(ch))
    }
}