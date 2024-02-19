package com.mnj.java_solutions.string

import java.util.Collections
import java.util.PriorityQueue

/**
 * Given a string s of lowercase alphabets and a number k, the task is to print the minimum value of the string after removal of k characters. The value of a string is defined as the sum of squares of the count of each distinct character present in the string.
 *
 *
 * Example 1:
 *
 *
 * Input:
 * s = abccc, k = 1
 * Output:
 * 6
 * Explaination:
 * We remove c to get the value as 12 + 12 + 22
 * Example 2:
 *
 *
 * Input:
 * s = aabcbcbcabcc, k = 3
 * Output:
 * 27
 * Explaination:
 * We remove two 'c' and one 'b'. Now we get the value as 32 + 32 + 32.
 */
class GameWithString19022024 {
    fun minValue(s: String, k: Int) {
        // code here
        var k = k
        val map: MutableMap<Char, Int> = HashMap()
        for (ch in s.toCharArray()) map[ch] = map.getOrDefault(ch, 0) + 1
        val pq = PriorityQueue(Collections.reverseOrder<Int>())
        for (x in map.values) pq.add(x)
        while (k > 0) {
            val curr = pq.poll()
            pq.add(curr - 1)
            k--
        }
        var ans = 0
        while (!pq.isEmpty()) {
            val curr = pq.poll()
            ans += curr * curr
        }
        System.out.printf("==>> Result: $ans")
    }
}
