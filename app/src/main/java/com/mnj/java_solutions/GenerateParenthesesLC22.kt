package com.mnj.java_solutions

import java.util.ArrayList

/**
 *
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 *
 * Example 1:
 *
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 *
 */
class GenerateParenthesesLC22 {
    fun generateParenthesis() {
        val list: MutableList<String> = ArrayList()
        val n = 2
        backtrack(list, "", 0, 0, n)
        for (i in list.indices) println("==>> " + list[i])
    }

    private fun backtrack(
        list: MutableList<String>,
        curr_string: String,
        open: Int,
        close: Int,
        max: Int
    ) {

        //base condition
        //if max = 3 then maximum 3 pairs are possible
        if (curr_string.length == 2 * max) {
            list.add(curr_string)
            return
        }
        if (open < max) {
            backtrack(list, "$curr_string(", open + 1, close, max)
        }
        if (close < open) {
            backtrack(list, "$curr_string)", open, close + 1, max)
        }
    }
}