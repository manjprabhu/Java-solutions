package com.mnj.java_solutions.tasks

class CombineCharArrayToString {

    fun combineArrayToString() {
        val input = listOf("I", "like", "studying", "java", "html", "css", "and", "swift")
        val result = StringBuilder()

        for(str in input) {
            result.append("$str ")
        }

        println("==>> Result : $result")
    }
}