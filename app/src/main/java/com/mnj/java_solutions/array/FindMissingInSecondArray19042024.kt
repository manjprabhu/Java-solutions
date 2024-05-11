package com.mnj.java_solutions.array

/**
 * Given two integer arrays a of size n and b of size m, the task is to find the numbers which are present in the first array a, but not present in the second array b.
 *
 *
 * Note: Numbers to be returned should in order as they appear in array a.
 *
 *
 * Example 1:
 *
 *
 * Input:
 * n = 6, m = 5
 * a[] = {1, 2, 3, 4, 5, 10}
 * b[] = {2, 3, 1, 0, 5}
 * Output:
 * 4 10
 * Explanation:
 * 4 and 10 are present in first array, but not in second array.
 * Example 2:
 *
 *
 * Input:
 * n = 5, m = 5
 * a[] = {4, 3, 5, 9, 11}
 * b[] = {4, 9, 3, 11, 10}
 * Output:
 * 5
 * Explanation:
 * Second array does not contain element 5.
 */
class FindMissingInSecondArray19042024 {
    fun findMissing() {
        val a = intArrayOf(1, 2, 3, 4, 5, 10)
        val b = intArrayOf(2, 3, 1, 0, 5)
        val al = ArrayList<Int>()
        val set: MutableSet<Int> = HashSet()
        for (x in b) {
            set.add(x)
        }
        for (x in a) {
            if (!set.contains(x)) al.add(x)
        }
        println("Missing number is : $al")
    }
}
