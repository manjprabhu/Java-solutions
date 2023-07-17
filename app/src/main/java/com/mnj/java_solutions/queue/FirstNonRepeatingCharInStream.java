package com.mnj.java_solutions.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharInStream {
/*
* Given an input stream A of n characters consisting only of lower case alphabets.
* While reading characters from the stream,
*  you have to tell which character has appeared only once in the stream upto that point.
*  If there is no such character then append '#' to the answer.
*
* Input: A = "aabc"
Output: "a#bb"
Explanation: For every character first non
repeating character is as follow-
"a" - first non-repeating character is 'a'
"aa" - no non-repeating character so '#'
"aab" - first non-repeating character is 'b'
"aabc" - first non-repeating character is 'b'
* */
    public void FirstNonRepeating() {
        String str = "xx";

        //to maintain the frequency of chars;
        int[] arr = new int[26];
        StringBuilder result = new StringBuilder();

//To maintain the chars
        Queue<Character> queue = new LinkedList<>();

        for(int i=0;i<str.length();i++) {

            char ch = str.charAt(i);

//Add the chars to queue
            queue.add(ch);

//Maintain the frequency of chars
            arr[ch-'a']++;

            while (!queue.isEmpty()) {

                if(arr[queue.peek()-'a'] ==1) {
                    result.append(queue.peek());
                    break;
                } else
                    queue.poll();
            }
            if(queue.isEmpty())
                result.append("#");

        }
        System.out.println("==>> Result is :"+result.toString());
    }
}
