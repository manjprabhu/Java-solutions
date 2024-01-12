package com.mnj.java_solutions.gfg

/**
 * You are going to book a taxi. There are infinite number of points 1, 2, 3... on the X axis and your current position is cur.
 * There are N Taxis near you, and the position of those taxis is given as an array pos.
 * Where pos[i] denotes the position of the ith taxi. You are also given an array time.
 * Where time[i] denotes the time taken by the ith taxi to cover 1 unit of distance.
 * Your task is to find the minimum time to board a taxi.
 *
 *
 *
 *
 * Input:
 * N = 3, cur = 4
 * pos = [1, 5, 6]
 * time = [2, 3, 1]
 * Output:
 * 2
 * Explanation:
 * Total time taken by the 1st taxi will be: (4-1)*2 = 6
 * Total time taken by the 2nd taxi will be: (5-4)*3 = 3
 * Total time taken by the 3rd taxi will be: (6-4)*1 = 2
 * So, the minimum time will be 2 sec.
 */
class TaxiBooking {
    fun taxiBooking() {
        val N = 3
        val cur = 4
        val pos = intArrayOf(1, 5, 6)
        val time = intArrayOf(2, 3, 1)
        var result = Int.MAX_VALUE
        for (i in 0 until N) {
            val distance = time[i] * Math.abs(cur - pos[i])
            result = Math.min(distance, result)
        }
        println("==>> Minimum time taken by taxi is :$result")
    }
}