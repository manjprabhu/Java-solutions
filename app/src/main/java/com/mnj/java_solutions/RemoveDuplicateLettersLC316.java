package com.mnj.java_solutions;

import java.util.Stack;

/**
 * Given a string s, remove duplicate letters so that every letter appears once and only once.
 * You must make sure your result is
 * the smallest in lexicographical order among all possible results.
 **/
//1081. Smallest Subsequence of Distinct Characters
public class RemoveDuplicateLettersLC316 {

    public void removeDuplicateLetters() {
        String str = "bcabc";

        int[] lastIndex = new int[26];// stores the last occurrence index for every char
        boolean[] visited = new boolean[26];

        //calculate the last occurrence index.
        for (int i = 0; i < str.length(); i++)
            lastIndex[str.charAt(i) - 'a'] = i;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i) - 'a';
            if (visited[c]) continue;
            visited[c] = true;

            //check if top element is stack is lexcograpically greater than current char
            // then check if stack top element exists on right side of current char in staring
            //if yes then remove the stack top element. ( this is to maintaint he lexicographic order)
            //in above string we push b and c to stack , when current char is a , check in stack that if c (stack top element)
            // exists in the given string on right side of current char i.e a,
            while (!stack.isEmpty() && stack.peek() > c && lastIndex[stack.peek()] > i) {
                visited[stack.pop()] = false;
            }
            stack.push(c);
        }
        StringBuilder result = new StringBuilder();
        for (int l : stack)
            result.append((char) (l + 'a'));
        System.out.println("==>> Result string is  :" + result);
    }
}
