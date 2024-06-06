package com.mnj.java_solutions.tasks

import java.util.Arrays

class MissingElementsInArray {

    fun missingElements() {
        val arr = intArrayOf(1, 4, 10, 7, 8, -1)
        Arrays.sort(arr)

        val set = HashSet<Int>()

        for (i in arr[0] until arr[arr.size - 1]) {
            set.add(i)
        }

        for (ele in arr)
            set.remove(ele)

        for (ele in set)
            println("==>> Missing Number : $ele")
    }
}