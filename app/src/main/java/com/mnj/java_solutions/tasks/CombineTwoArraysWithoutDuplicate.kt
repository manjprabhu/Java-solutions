package com.mnj.java_solutions.tasks

class CombineTwoArraysWithoutDuplicate {

    fun combineArraysWithoutDuplicate() {
        val arrOne = intArrayOf(1, 2, 3, 4, 5)
        val arrTwo = intArrayOf(8, 6, 4, 1)
        val result = HashSet<Int>()
        for (ele in arrOne)
            result.add(ele)

        for (ele in arrTwo)
            result.add(ele)

        for (ele in result)
            println("==>>> Result : $ele")
    }
}