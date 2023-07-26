package com.mnj.java_solutions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *

 * Example 1:
 *
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 *
 * **/
public class GenerateParenthesesLC22 {

    public void generateParenthesis() {
        List<String> list = new ArrayList<>();
        int n = 2;
        backtrack(list, "", 0, 0, n);

        for (int i = 0; i < list.size(); i++)
            System.out.println("==>> " + list.get(i));
    }

    private void backtrack(List<String> list, String curr_string, int open, int close, int max) {

        //base condition
        //if max = 3 then maximum 3 pairs are possible
        if (curr_string.length() == 2 * max) {
            list.add(curr_string);
            return;
        }

        if (open < max) {
            backtrack(list, curr_string + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(list, curr_string + ")", open, close + 1, max);
        }
    }
}
