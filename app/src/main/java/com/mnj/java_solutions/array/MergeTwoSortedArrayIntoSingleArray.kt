package com.mnj.java_solutions.array

class MergeTwoSortedArrayIntoSingleArray {

    fun mergeSortedArray() {
        val arr1 = intArrayOf(1, 3, 5, 7)
        val arr2 = intArrayOf(2, 4, 6, 8)

        var i = 0
        var j = 0
        var k = 0

        val result = IntArray(arr1.size + arr2.size)

        while (i < arr1.size && j < arr2.size) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++]

            } else {
                result[k++] = arr2[j++]
            }
        }

        while (i < arr1.size)
            result[k++] = arr1[i++]

        while (j < arr2.size)
            result[k++] = arr2[j++]

        for (ele in result)
            println("==>> $ele")
    }
}