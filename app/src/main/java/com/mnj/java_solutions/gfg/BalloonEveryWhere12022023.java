package com.mnj.java_solutions.gfg;

import java.util.HashMap;

/***
 *
 * ob is very fond of balloons. Once he visited an amusement park with his mother.
 * The mother told Bob that she would buy him a balloon only if he answer her problem right.
 * She gave Bob a string S [contains only lowercase characters] and
 * asked him to use the characters of string to form as many instances of the word "balloon" as possible.
 * Return the maximum number of instances that can be formed.
 *
 * Input:
 * S: nlaebolko
 * Output: 1
 * Explanation:
 * Here, the number of occurence of 'b' = 1
 * of occurence of 'a' = 1
 * of occurence of 'l' = 2
 * of occurence of 'o' = 2
 * of occurence of 'n' = 1
 * So, we can form 1 "balloon" using the letters.*/
public class BalloonEveryWhere12022023 {

    public void maxInstance() {
        String str = "nlaebolko";
        HashMap<Character, Integer> map = new HashMap<>();

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'b' || ch == 'l' || ch == 'o' || ch == 'n')
                map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        map.put('l', map.get('l') / 2);
        map.put('o', map.get('o') / 2);

        for (char x : map.keySet()) {
            result = Math.min(result, map.get(x));
        }

        System.out.println("==>> Number of balloons :" + result);
    }
}
