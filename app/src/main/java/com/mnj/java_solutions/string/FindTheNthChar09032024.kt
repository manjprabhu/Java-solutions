package com.mnj.java_solutions.string

/**
 * Given a binary string s. Perform r iterations on string s, where in each iteration 0 becomes 01 and 1 becomes 10. Find the nth character (considering 0 based indexing) of the string after performing these r iterations (see examples for better understanding).
 *
 *
 * Example 1:
 *
 *
 * Input:
 * s = "1100"
 * r = 2
 * n = 3
 * Output:
 * 1
 * Explanation:
 * After 1st iteration s becomes "10100101".
 * After 2nd iteration s becomes "1001100101100110".
 * Now, we can clearly see that the character at 3rd index is 1, and so the output.
 * Example 2:
 *
 *
 * Input:
 * s = "1010"
 * r = 1
 * n = 2
 * Output:
 * 0
 * Explanation :
 * After 1st iteration s becomes "10011001".
 * Now, we can clearly see that the character at 2nd index is 0, and so the output.
 */
class FindTheNthChar09032024 {
    fun nthCharacter(): Char {
        var str = "1010"
        val r = 1
        val n = 2
        for (i in 0 until r) {
            val curr = StringBuilder()
            for (ch in str.toCharArray()) {
                if (ch == '0') curr.append("01") else curr.append("10")
                if (curr.length > n) break
            }
            str = curr.toString()
        }
        return str[n]
    }
}
