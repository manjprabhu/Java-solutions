package com.mnj.java_solutions;

/**
 * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
 * <p>
 * A shift on s consists of moving the leftmost character of s to the rightmost position.
 * <p>
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcde", goal = "cdeab"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "abcde", goal = "abced"
 * Output: false
 **/
public class RotateStringLC796 {

    public void rotateString() {
        String s = "abcde";
        String goal = "bcdea";
        boolean result = s.length() == goal.length() && (s + s).contains(goal);
        if (result) {
            System.out.println("==>> True");
        } else
            System.out.println("==>> false");
    }
}
