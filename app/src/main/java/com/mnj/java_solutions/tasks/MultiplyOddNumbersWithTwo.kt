package com.mnj.java_solutions.tasks

class MultiplyOddNumbersWithTwo {

    fun multiplyOddNumbers() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
        val result = mutableListOf<Int>()

        for (ele in arr) {
            if (ele % 2 != 0)
                result.add(ele * 2)
        }
        for (ele in result)
            println("==>> Result is : $ele")
    }
}