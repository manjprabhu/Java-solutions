package com.mnj.java_solutions.gfg

class PowerOfNumbers {
    fun power() {
        val n = 2
        val r = 10
        println("==>> Power of Number is :" + `fun`(n, r))
    }

    private fun `fun`(n: Int, r: Int): Long {
        if (r == 0) {
            return 1
        }
        var ans: Long
        val mod = 1000000007
        if (r % 2 == 0) {
            ans = `fun`(n, r / 2)
            ans = ans * ans % mod
        } else {
            ans = (n % mod).toLong()
            ans = ans * `fun`(n, r - 1) % mod % mod
        }
        return ans % mod
    }
}