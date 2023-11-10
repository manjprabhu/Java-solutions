package com.mnj.java_solutions;

import java.util.Stack;

/**
 * Given a pattern containing only I's and D's. I for increasing and D for decreasing. Devise an algorithm to print the minimum number following that pattern. Digits from 1-9 and digits can't repeat.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * D
 * Output:
 * 21
 * Explanation:
 * D is meant for decreasing, so we choose the minimum number among all possible numbers like 21,31,54,87,etc.
 * Example 2:
 * <p>
 * Input:
 * IIDDD
 * Output:
 * 126543
 * Explanation:
 * Above example is self- explanatory,
 * 1 < 2 < 6 > 5 > 4 > 3
 * I - I - D - D - D
 **/
public class NumberFollowingPattern10112023 {

    public void printMinNumberForPattern() {
        String str = "IIDDD";
        Stack<Integer> st = new Stack<>();
        int num = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            st.push(num++);
            if (str.charAt(i) == 'I') {
                while (!st.empty()) sb.append(st.pop());
            }
        }

        st.push(num++);
        while (st.size() > 0) sb.append(st.pop());
        System.out.println("==>> Result is :" + sb.toString());
    }
}
