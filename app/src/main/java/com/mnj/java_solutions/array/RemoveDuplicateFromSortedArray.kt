package com.mnj.java_solutions.array

class RemoveDuplicateFromSortedArray {

    fun removeDuplicate() {

        val array = intArrayOf(1, 2, 2, 3, 4, 5, 6, 6, 6, 7, 8)


        var index = 1//index that tracks the unique element

        for (i in 1 until array.size) {
            if (array[i] != array[i - 1]) {
                array[index++] = array[i]
            }
        }

        for (ele in 0 until index)
            println("${array[ele]}")
    }
}