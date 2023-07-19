package com.mnj.java_solutions.greedy;

import java.util.Arrays;

public class AssignCookiesLC455 {

    /**
     * Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
     * <p>
     * Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with;
     * and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content.
     * Your goal is to maximize the number of your content children and output the maximum number.
     * <p>
     * Input: g = [1,2], s = [1,2,3]
     * Output: 2
     * Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2.
     * You have 3 cookies and their sizes are big enough to gratify all of the children,
     * You need to output 2.
     */

    public void assignCookies() {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};

        Arrays.sort(g);
        Arrays.sort(s);

        int a_pointer = 0;
        int b_pointer = 0;

        while (a_pointer < g.length && b_pointer < s.length) {
            if (g[a_pointer] <= s[b_pointer]) {
                a_pointer++;
            }
            b_pointer++;
        }

        System.out.println("==>> Number of content children :" + a_pointer);

    }
}
