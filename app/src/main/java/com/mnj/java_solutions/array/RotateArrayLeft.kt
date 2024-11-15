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


    fun rotateLeftSolutionTwo() {
        var arr = intArrayOf(1, 2, 4, 6, 7, 8)
        var d = 2

        val temp = IntArray(arr.size)

        var index = 0
        for (i in 0 until arr.size - d)
            temp[index++] = arr[d + i]

        for (i in 0 until d) {
            temp[arr.size - d + i] = arr[i]
        }

        var idx = 0
        for (element in temp)
            arr[idx++] = element

        for (ele in arr)
            println("$ele")
    }
}