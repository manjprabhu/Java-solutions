package com.mnj.java_solutions

/**
 * Given a number n, the task is to find out whether this number is a Smith number or not.
 * A Smith number is a composite number whose sum of digits is equal to the sum of digits of its prime factorization.
 *
 * Example 1:
 *
 * Input:
 * n = 4
 * Output:
 * 1
 * Explanation:
 * The sum of the digits of 4 is 4, and the sum of the digits of its prime factors is 2 + 2 = 4.
 * Example 2:
 *
 * Input:
 * n = 378
 * Output:
 * 1
 * Explanation:
 * 378 = 21*33*71 is a Smith number since 3+7+8 = 2*1+3*3+7*1.
 */
class SmithNumber08122023 {
    fun smithNumber() {
        val n = 4
        if (digitSum(n) == primeFSum(n)) {
            println("==>> Given number is smith number...")
            return
        }
        println("==>> Given number is NOT smith number...")
    }

    private fun primeFSum(n: Int): Int {
        var n = n
        var count = 0
        var res = 0
        var i = 2
        while (n > 1) {
            if (n % i == 0) count++
            if (n % i == 0) {
                if (i > 10) res += digitSum(i) else res = res + i
                n = n / i
            } else i++
        }
        return if (count > 1) res else 0
    }

    private fun digitSum(x: Int): Int {
        var x = x
        var res = 0
        while (x != 0) {
            res += x % 10
            x /= 10
        }
        return res
    }
}