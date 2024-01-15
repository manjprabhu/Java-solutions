package com.mnj.java_solutions

/**
 * Given a non-negative integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some integer x. Return true if N is power of 2 else return false.
 *
 * Example 1:
 *
 * Input:
 * N = 8
 * Output:
 * YES
 * Explanation:
 * 8 is equal to 2 raised to 3 (23 = 8).
 *
 */
class PowerOfTwo18092023 {
    val isPowerOfTwo: Unit
        get() {
            var n: Long = 12
            while (n > 1 && n % 2 == 0L) {
                n /= 2
            }
            if (n == 1L) println("Number is power of two") else println("==>> Number is NOT power of 2")
        }
}