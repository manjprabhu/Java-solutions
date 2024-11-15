package com.mnj.java_solutions.array

class IntersectionOfTwoArrays {

    //When array contains duplicate elements
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


    //When array elements are Unique
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

    //When both arrays are sorted
    //We can you use 2 pointer approach

    fun intersectionOfArraysWithSortedElements() {
        val arr1 = intArrayOf(1, 2, 3, 3, 4, 5, 6)
        val arr2 = intArrayOf(3, 3, 5)

        //Initialize 2 pointers i and j. i=0 and will iterate over arr1, j=0 and will iterate over arr2.
        var i = 0
        var j = 0
        val result = mutableListOf<Int>()

        while (i < arr1.size && j < arr2.size) {
            if (arr1[i] < arr2[j]) {//Now arr1[i] is less than arr2[j], so we are certainly not going to find arr1[i],i.e,1 any further in the array. Let's increment the pointer i and check the next element.
                i++
            } else if (arr1[j] < arr2[i]) {
                j++
            } else {
                result.add(arr1[i])
                i++
                j++
            }
        }

        for(ele in result)
            println("$ele")
    }
}