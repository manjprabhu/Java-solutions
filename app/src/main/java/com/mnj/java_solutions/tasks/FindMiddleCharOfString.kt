package com.mnj.java_solutions.tasks

//Question: Print the letter that located in the middle of each word at the given text?
class FindMiddleCharOfString {

    fun middleOfString() {
        val str = "Indian Interactive Indonesia"
        val strArray = str.split(" ")

        for (s in strArray) {
            val middle = s.length / 2
            if (s.length % 2 == 0) {
                val result = StringBuilder()
                println("==>> Result : ${result.append(s[middle - 1]).append(s[middle])}")
            } else {
                println("==>> Result :${s[middle]}")
            }
        }
    }
}