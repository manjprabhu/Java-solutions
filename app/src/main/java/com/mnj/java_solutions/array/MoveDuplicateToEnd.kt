package com.mnj.java_solutions.array

class MoveDuplicateToEnd {

    fun moveDuplicateToEnd() {
        val input = intArrayOf(2,1,5,2,4,3,4,5)

        val seen = mutableSetOf<Int>()
        val duplicate = mutableListOf<Int>()
        val uniqueElements = mutableListOf<Int>()

        for(num in input) {
            if(num in seen) {
                duplicate.add(num)
            } else {
                uniqueElements.add(num)
                seen.add(num)
            }
        }

        val result = uniqueElements.plus(duplicate).toIntArray()

        for(i in result)
            println("==>> $i")

    }
}