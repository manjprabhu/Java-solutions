package com.mnj.java_solutions.array

class PairWithGivenSum {

    fun hasArrayTwoCandidates() {
        val arr = intArrayOf(1, 4, 45, 6, 10, 8)
        val sum = 16
        val map = HashMap<Int, Int>()
        for (i in arr.indices) {
            if (map.containsKey(sum - arr[i])) {
                println("==>> Pair with given sum: " + arr[i] + " And " + arr[map[sum - arr[i]]!!])
                return
            }
            map[arr[i]] = i
        }
        println("==>> Pair with given sum does NOT exists")
    }
}