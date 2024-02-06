package com.mnj.java_solutions.slidingwindow

class SubArrayWithZeroSum {
    fun findsum() {
        val arr = intArrayOf(4, 2, -3, 1, 6)
        for (i in arr.indices) {
            for (j in i until arr.size) {
                var sum = 0
                for (k in i..j) {
                    sum += arr[k]
                }
                if (sum == 0) {
                    println("==>>> There exists a subarray with zero sum")
                    return
                }
            }
        }
        println("==>>> There exists NO subarray with zero sum")
    }

    fun findsum2() {
        val arr = intArrayOf(4, 2, -3, 1, 6)
        for (i in arr.indices) {
            var sum = 0
            for (j in i until arr.size) {
                sum += arr[j]
                if (sum == 0) {
                    println("==>>>2  There exists a subarray with zero sum")
                    return
                }
            }
        }
        println("==>>>2  There exists NO subarray with zero sum")
    }

    fun findsum3() {
        val arr = intArrayOf(4, 2, -3, 1, 6)
        val set = HashSet<Int>()
        var sum = 0
        for (num in arr) {
            sum += num

            //If current element is zero
            // if current sum is zero
            // if set already contains zero (in this case, subarray sum b/w current element)
            if (num == 0 || sum == 0 || set.contains(sum)) {
                println("==>>>3  There exists a subarray with zero sum")
                return
            }
            set.add(sum)
        }
        println("==>>>3  There exists NO subarray with zero sum")
    }
}
