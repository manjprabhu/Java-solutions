package com.mnj.java_solutions.array

class MaximumConsecutiveZeros {

    fun maxConsecutiveOnes() {
        val arr = intArrayOf(1, 1, 1, 0, 1, 1, 1, 1)

        var maxCount = 0
        var countSoFar = 0

        for (i in arr.indices) {
            if (arr[i] == 1 ) {
                countSoFar++
            } else {
                if (countSoFar > maxCount) {
                    maxCount = countSoFar
                }
                countSoFar = 0

            }
        }
        var result = maxCount
        if(countSoFar > maxCount)
            result = countSoFar
        println("==>> Max ones $result")
    }
}