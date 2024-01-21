package com.mnj.java_solutions.slidingwindow

class SubarraySumsDivisibleByKLC974 {
    fun subarraysDivByK() {
        val arr = intArrayOf(4, 5, 0, -2, -3, 1)
        val k = 5
        var j = 0
        var sum = 0
        var rem = 0
        var count = 0
        val map = HashMap<Int, Int>()
        map[0] = 1
        while (j < arr.size) {
            sum = sum + arr[j]
            rem = sum % k
            if (rem < 0) rem = rem + k
            if (map.containsKey(rem)) {
                count = count + map[rem]!!
                map[rem] = map.getOrDefault(rem, 0) + 1
            } else {
                map[rem] = 1
            }
            j++
        }
        println("==>> Sub arrays sum divisible by K:$count")
    }
}
