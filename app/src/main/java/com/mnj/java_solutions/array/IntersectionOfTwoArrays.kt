package com.mnj.java_solutions.array

class IntersectionOfTwoArrays {

    fun intersectionOfArraysWithDuplicateElement() {
        val arr1 = intArrayOf(1, 2, 3, 3, 1, 5)
        val arr2 = intArrayOf(2, 3, 2, 4)

        val result = mutableListOf<Int>()

        for (ele in arr1) {
            for (ele2 in arr2) {

                if (ele == ele2 && !result.contains(ele)) {
                    result.add(ele)
                }
            }
        }
        for (ele in result)
            println("$ele")
    }

    fun intersectionOfArraysWithUniqueElement() {
        val arr1 = intArrayOf(1, 3, 6, 2)
        val arr2 = intArrayOf(2, 6, 8, 19)

        val result = mutableListOf<Int>()

        for (ele in arr1) {
            for (ele2 in arr2) {
                if (ele == ele2) {
                    result.add(ele)
                }
            }
        }
        for (ele in result)
            println("$ele")
    }
}