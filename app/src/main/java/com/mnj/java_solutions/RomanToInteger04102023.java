package com.mnj.java_solutions;

import java.util.HashMap;
/**
 * Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
 * I 1
 * V 5
 * X 10
 * L 50
 * C 100
 * D 500
 * M 1000
 *
 * Example 1:
 *
 * Input:
 * s = V
 * Output: 5
 * Example 2:
 *
 * Input:
 * s = III
 * Output: 3
 *
 * **/
public class RomanToInteger04102023 {

    public void romanToDecimal() {
        String str = "V";
        int n = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = map.get(str.charAt(n - 1));

        for (int i = n - 2; i >= 0; i--) {
            int curr = map.get(str.charAt(i));
            int last = map.get(str.charAt(i + 1));

            if (curr < last) res = res - curr;
            else res += curr;
        }

        System.out.println("Result is :" + res);
    }
}
