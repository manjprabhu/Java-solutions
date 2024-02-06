package com.mnj.java_solutions.array

class SumArray {
    fun sum() {
        val arr = intArrayOf(1, 2, 3, 2, 5, 6, 7)
        val result = mutableListOf<Int>()
        var i = 0

        while (i < arr.size) {
            var sum = 0
            sum = if (i == arr.size - 1) {
                arr[i]
            } else {
                arr[i] + arr[i + 1]
            }
            result.add(sum)
            i += 2
        }

        //Alternative type of loop
       /* for(i in 0.. arr.size step 2) {
            var sum =0
            sum = if(i == arr.size-1)
                arr[i]
            else
                arr[i]+arr[i+1]
            result.add(sum)
        }

        for(i in arr.indices step 2) {
            var sum =0
            sum = if(i == arr.size-1)
                arr[i]
            else
                arr[i]+arr[i+1]
            result.add(sum)
            */
        for (x in result) println("==>> Result : $x")
    }
}
