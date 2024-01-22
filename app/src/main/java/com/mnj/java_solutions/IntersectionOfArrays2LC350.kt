package com.mnj.java_solutions

class IntersectionOfArrays2LC350 {
    fun IntersectionOfArrays() {
        val nums1 = intArrayOf(1, 2, 2, 1)
        val nums2 = intArrayOf(2, 2)
        val map = HashMap<Int, Int>()
        val result: MutableList<Int> = ArrayList()
        for (num in nums1) {
            map[num] = map.getOrDefault(num, 0) + 1
        }
        for (num in nums2) {
            if (map.containsKey(num)) {
                result.add(num)
                map[num] = map[num]!! - 1
                if (map[num] == 0) {
                    map.remove(num)
                }
            }
        }
        for (i in result.indices) {
            println("==>>" + result[i])
        }
    }
}
