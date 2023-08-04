package com.mnj.java_solutions.array;


import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of ‘N’ integers.
 * You need to find the length of the longest sequence which contains the consecutive elements.
 **/
public class LongestConsecutiveSequenceInAnArray {

    public void longestSequence() {
        int[] arr = {100, 200, 1, 3, 2, 4};
        int longest = 1;

        for (int j : arr) {
            int x = j;
            int count = 1;
            while (linearSearch(arr, x + 1)) {
                count++;
                x++;
            }
            longest = Math.max(longest, count);
        }
        System.out.println("==>> Longest subsequence is :" + longest);
    }

    private boolean linearSearch(int[] arr, int num) {
        for (int j : arr) {
            if (j == num)
                return true;
        }
        return false;
    }

    public void longestSequence2() {
        int[] arr = {100, 200, 1, 3, 2, 4};
        int longest = 1;

        Set<Integer> set = new HashSet<>();
        for (int num : arr)
            set.add(num);

        for (int i : set) {
            //If a number, i, is a starting number of the sequence, ideally, i-1 should not exist in set.
            // So, for every element, i, in the set, we will check if i-1 exists inside the set.
            //If i-1 does not exist: This means i is a starting number of a sequence. So, for number, i, we will start finding the consecutive elements.
            if (!set.contains(i - 1)) {
                int count = 1;
                while (set.contains(i + 1)) {
                    count++;
                    i++;
                }
                longest = Math.max(longest, count);
            }
        }
        System.out.println("==>> 2 Longest subsequence is :" + longest);
    }
}
