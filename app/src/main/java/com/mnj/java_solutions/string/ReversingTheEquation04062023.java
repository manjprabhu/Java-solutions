package com.mnj.java_solutions.string;

import java.util.Stack;

/**
 * Given a mathematical equation that contains only numbers and +, -, *, /. Print the equation in reverse, such that the equation is reversed, but the numbers remain the same.
 * It is guaranteed that the given equation is valid, and there are no leading zeros.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * S = "20-3+5*2"
 * Output: 2*5+3-20
 * Explanation: The equation is reversed with
 * numbers remaining the same.
 * Example 2:
 * <p>
 * Input:
 * S = "5+2*56-2/4"
 * Output: 4/2-56*2+5
 * Explanation: The equation is reversed with
 * numbers remaining the same.
 **/
public class ReversingTheEquation04062023 {

    public void reverseEqn() {

        String equation = "20-3+5*2";
        int n = equation.length();

        char[] s = equation.toCharArray();
        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            if (s[i] == '+' || s[i] == '-' || s[i] == '*' || s[i] == '/') {
                while (!st.isEmpty()) {
                    res.append(st.pop());
                }
                res.append(s[i]);
            } else
                st.push(s[i]);
        }
        while (!st.isEmpty()) {
            res.append(st.pop());
        }
        System.out.println("==>>> Result is :" + res.toString());
    }
}
