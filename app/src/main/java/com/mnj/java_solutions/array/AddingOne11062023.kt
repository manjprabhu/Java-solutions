package com.mnj.java_solutions.array

/**
 * Start with an array A of size N. Initially all elements of the array A are zero.
 * You will be given K positive integers. Let j be one of these integers,
 * you have to add 1 to all A[i], where i ≥ j.
 * task is to print the array A after all these K updates are done.
 *
 *
 * Input:
 * N = 3, K = 4
 * 1 1 2 3
 * Output:
 * 2 3 4
 * Explanation:
 * Initially the array is {0, 0, 0}. After the
 * first 1, it becomes {1, 1, 1}. After the
 * second 1 it becomes {2, 2, 2}. After 2,
 * it becomes {2, 3, 3} and
 * After 3 it becomes, {2, 3, 4}.
 */
class AddingOne11062023 {
    //time complexity O(k*N)
    fun addingOne() {
        val updates = intArrayOf(0, 0, 0)
        val n = updates.size
        val k = 4
        val increment = intArrayOf(1, 1, 2, 3)
        for (i in 0 until k) {
            // since this is one based indexing we are subtracting -1
            for (j in increment[i] - 1 until n) {
                updates[j]++
            }
        }
        for (num in updates) {
            println("==>> Number :$num")
        }
    }

    fun addingOne2() {
        val updates = intArrayOf(0, 0, 0)
        val n = updates.size
        val k = 4
        val increment = intArrayOf(1, 1, 2, 3)
        for (i in 0 until k) {
            updates[increment[i] - 1]++
        }
        for (i in 1 until n) updates[i] += updates[i - 1]
        for (num in updates) {
            println("==>> Number :$num")
        }
    }
}