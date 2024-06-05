package com.mnj.java_solutions.tasks

//Replace last 3  chars to X in given string

class ReplaceCharInString {

    fun replaceCharInString() {
        val str = "3455 6916 2983 563"

        val strArray = str.toCharArray()
        val result = StringBuilder()

        for (i in strArray.indices) {
            if (i >= strArray.size - 3)
                result.append("X")
            else
                result.append(strArray[i])
        }
        println("==>> Result: $result")
    }
}