package com.mnj.java_solutions.array

class SingleUniqueElementInSortedArray {

    fun singleUniqueElement() {

        val arr = intArrayOf(1,1,2,2,3,4,4,5,5)
        var uniqueElement = 0

        for(ele in arr)
            uniqueElement = uniqueElement xor ele

        println("==>> Unique element is $uniqueElement")
    }


    fun singleUniqueElementSolutionTwo() {
        val arr = intArrayOf(1,1,2,2,3,3,4,5,5,6,6)

        var uniqueElement =0


        for(i in 0 until arr.size-1 step 2) {
            if(arr[i]!=arr[i+1]) {
                println("==>> ${arr[i]}")
                uniqueElement= arr[i]
                break
            }
        }
        println("==>> Unique element is $uniqueElement")
    }
}