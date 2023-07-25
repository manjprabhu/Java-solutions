package com.mnj.java_solutions.twopointer;

public class ReverseStringLC541 {

    /**
     * Given a string s and an integer k, reverse the first k characters for every 2k characters
     * counting from the start of the string.
     * <p>
     * If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters,
     * then reverse the first k characters and leave the other as original.
     * <p>
     * Example 1:
     * <p>
     * Input: s = "abcdefg", k = 2
     * Output: "bacdfeg"
     * Example 2:
     * <p>
     * Input: s = "abcd", k = 2
     * Output: "bacd"
     */

    public void reverse() {
        String str = "abcd";
        int k = 2;
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i = i + (2 * k)) {
            int start = i;
            int end = Math.min(i + k - 1, str.length() - 1);

            while (start < end) {
                char temp = ch[start];
                ch[start++] = ch[end];
                ch[end--] = temp;
            }
        }

        System.out.println("==>> Reverse string is  :" + new String(ch));
    }
}
