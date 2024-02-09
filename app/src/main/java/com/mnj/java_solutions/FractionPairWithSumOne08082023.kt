package com.mnj.java_solutions

class FractionPairWithSumOne08082023 {
    fun countFractions() {
        val numerator = intArrayOf(3, 1, 12, 81, 2)
        val denominator = intArrayOf(9, 10, 18, 90, 5)
        val n = numerator.size
        var count = 0
        val map = HashMap<String, Int>()
        for (i in 0 until n) {
            val k = gcd(numerator[i], denominator[i])
            val num = numerator[i] / k
            val den = denominator[i] / k
            val a = "$num/$den"
            val d = (den - num).toString() + "/" + den
            if (map.containsKey(d)) {
                count = count + map[d]!!
            }
            map[a] = map.getOrDefault(a, 0) + 1
        }
        println("==>> number of pairs :$count")
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (a == 0) b else gcd(b % a, a)
    }
}
