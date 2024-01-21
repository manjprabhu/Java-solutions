package com.mnj.java_solutions

/***
 * Given a number N. The task is to find the Nth catalan number.
 * The first few Catalan numbers for N = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …
 *
 * Catalan Number for N is equal to the number of expressions containing N pairs of paranthesis
 * that are correct matched, i.e., for each of the N '(' there exist N ')' on there right and vice versa.
 *
 * Since answer can be huge return answer modulo 1e9+7. */
class NthCatalanNumber16082023 {
    fun findCatalan() {
        val n = 5
        val mod = 1000000007
        val arr = IntArray(n + 1)
        arr[0] = 1
        arr[1] = 1
        for (i in 2..n) {
            for (j in 0 until i) {
                val p = arr[j].toLong() * arr[i - 1 - j]
                arr[i] = ((arr[i] + p) % mod).toInt()
            }
        }
        println("==>> Nth Catalan number is :" + arr[n])
    }
}
