package com.mnj.java_solutions.string

class CountOccurrenceOfChar {

    fun countOccurrence() {
        val str = "Hellooooo"
        val map = mutableMapOf<Char,Int>()

        val chArray = str.toCharArray()
        for(ch  in chArray) {
            map[ch] = map.getOrDefault(ch,0)+1
        }

        val count = map.maxByOrNull { it.value }
        //to print the max occurring char use below line
        // val count = map.maxByOrNull { it.value }?.key
        println("Max count is $count")

    }
}