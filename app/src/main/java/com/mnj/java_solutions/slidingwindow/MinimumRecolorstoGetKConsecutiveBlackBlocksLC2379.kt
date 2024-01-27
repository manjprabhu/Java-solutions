package com.mnj.java_solutions.slidingwindow

/**
 * You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.
 *
 *
 * You are also given an integer k, which is the desired number of consecutive black blocks.
 *
 *
 * In one operation, you can recolor a white block such that it becomes a black block.
 *
 *
 * Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
 *
 *
 * Input: blocks = "WBBWWBBWBW", k = 7
 * Output: 3
 * Explanation:
 * One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
 * so that blocks = "BBBBBBBWBW".
 * It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
 * Therefore, we return 3.
 */
class MinimumRecolorstoGetKConsecutiveBlackBlocksLC2379 {
    fun minimumRecolors() {
        val blocks = "WBBWWBBWBW"
        val k = 7
        var min = Int.MAX_VALUE
        var count = 0
        var start = 0
        var end = 0
        while (end < blocks.length) {
            if (blocks[end] == 'W') count++
            if (end - start + 1 < k) {
                end++
            } else if (end - start + 1 == k) {
                min = Math.min(min, count)
                if (blocks[start] == 'W') count--
                start++
                end++
            }
        }
        println("==>> Minimum number of white to recolor to get K consecutive blacks : $min")
    }
}
