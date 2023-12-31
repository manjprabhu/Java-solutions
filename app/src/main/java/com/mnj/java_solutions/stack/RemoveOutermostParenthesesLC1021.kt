package com.mnj.java_solutions.stack

import java.lang.StringBuilder
import java.util.*

/**
 * A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.
 *
 *
 * For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 * A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.
 *
 *
 * Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
 *
 *
 * Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
 *
 *
 *
 *
 *
 *
 * Example 1:
 *
 *
 * Input: s = "(()())(())"
 * Output: "()()()"
 * Explanation:
 * The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
 * After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
 * Example 2:
 *
 *
 * Input: s = "(()())(())(()(()))"
 * Output: "()()()()(())"
 * Explanation:
 * The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
 * After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
 * Solution
 *
 * Whenever an opening parenthesis is encountered,
 *
 * it is pushed onto the stack. Whenever a closing parenthesis is encountered, the last opening parenthesis is popped from the stack.
 *
 * If the stack size is greater than zero after pushing or popping, it means that the parenthesis is not an outer parenthesis, and it is added to the result string.
 * If the stack size is zero, it means that the parenthesis is an outer parenthesis and it is not added to the result string.
 */
class RemoveOutermostParenthesesLC1021 {
    fun removeOuterParentheses() {
        val s = "(()())(())"
        val bracket = Stack<Char>()
        val sb = StringBuilder("")
        for (i in s.indices) {
            if (s[i] == '(') {
                if (bracket.size > 0) {
                    sb.append(s[i])
                }
                bracket.push(s[i])
            } else {
                bracket.pop()
                if (bracket.size > 0) {
                    sb.append(s[i])
                }
            }
        }
        println("==>> Result string is  :$sb")
    }
}