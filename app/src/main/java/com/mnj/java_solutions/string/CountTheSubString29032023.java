package com.mnj.java_solutions.string;

/**
 * Given a string S. The task is to count the number of substrings which contains equal number of lowercase and uppercase letters.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * S = "gEEk"
 * Output: 3
 * Explanation: There are 3 substrings of
 * the given string which satisfy the
 * condition. They are "gE", "gEEk" and "Ek".
 * Example 2:
 * <p>
 * Input:
 * S = "WomensDAY"
 * Output: 4
 * Explanation: There are 4 substrings of
 * the given string which satisfy the
 * condition. They are "Wo", "ensDAY",
 * "nsDA" and "sD"
 **/
public class CountTheSubString29032023 {

    public void countSubstring() {
        String s = "WomensDAY";

        int cnt;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            cnt = 0;
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z')
                    cnt++;

                else cnt--;

                if (cnt == 0)
                    ans++;
            }
        }
        System.out.println("==>> Result is  :" + ans);
    }
}
