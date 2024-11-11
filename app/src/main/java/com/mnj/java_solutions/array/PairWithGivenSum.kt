package com.mnj.java_solutions.array
class PairWithGivenSum {
    fun hasArrayTwoCandidates() {
        val arr = intArrayOf(1, 4, 45, 6, 10, 8)
        val sum = 16
        val map = HashMap<Int, Int>()
        for (i in arr.indices) {
            val diff = sum -arr[i]
            if (map.containsKey(diff)) {
               // println("==>> Pair with given sum: " + arr[i] + " And " + arr[map[sum - arr[i]]!!])
                println("==>> Pair with given sum: " + arr[i] + " And " +arr[map[diff]!!])
                return
            }
            map[arr[i]] = i
        }
        println("==>> Pair with given sum does NOT exists")
    }

    fun hasArrayTwoCandidatesTwo() {
        println("==>>hasArrayTwoCandidatesTwo")
        val arr = intArrayOf(1,4,45,10,6,8,12)
        val sum  = 16
        val set = HashSet<Int>()

        for(num in arr) {
            val diff = sum -num
            if(set.contains(diff)) {
                println("==>> Pair with given sum: $num And $diff")
                return
            }
            set.add(num)
        }
    }
}