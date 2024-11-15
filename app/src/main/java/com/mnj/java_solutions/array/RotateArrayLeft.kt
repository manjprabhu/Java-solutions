package com.mnj.java_solutions.array

class RotateArrayLeft {

    fun rotateLeftSolutionOne() {
        val arr = intArrayOf(1, 2, 4, 6, 7, 8)
        val d = 2

        for (i in 0 until d) {
            val first = arr[0]

            for (j in 1 until arr.size)
                arr[j - 1] = arr[j]
            arr[arr.size - 1] = first
        }

        for (ele in arr)
            println("$ele")
    }
}