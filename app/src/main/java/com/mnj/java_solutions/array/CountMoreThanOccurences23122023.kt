package com.mnj.java_solutions.array

class CountMoreThanOccurences23122023 {

    fun countOccurence(arr: IntArray, n: Int, k: Int): Int {
        var k = k
        val hm: HashMap<Int, Int> = HashMap()
        k = n / k
        val set: HashSet<Int> = HashSet()
        for (x in arr) {
            hm[x] = hm.getOrDefault(x, 0) + 1
            if (hm[x]!! > k) set.add(x)
        }
        println("==>>Result : ${set.size}")
    }
}