package com.mnj.java_solutions.string;

/**
 * Geek is extremely punctual but today even he is not feeling like doing his homework assignment. He must start doing it immediately in order to meet the deadline. For the assignment, Geek needs to type a string s.
 * To reduce his workload, he has decided to perform one of the following two operations till he gets the string.
 * <p>
 * Append a character at the end of the string.
 * Append the string formed thus far to the end of the string. (This can not be done more than once.)
 * Help Geek find the minimum operations required to type the given string.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * s = abcabca
 * Output: 5
 * Explanation: a -> ab -> abc -> abcabc
 * -> abcabca
 * <p>
 * Example 2:
 * <p>
 * Input:
 * s = abcdefgh
 * Output: 8
 * Explanation: a -> ab -> abc -> abcd
 * -> abcde -> abcdef -> abcdefg -> abcdefgh
 **/
public class TypeIt25012023 {

    public void minOperation() {
        String str = "abcabca";
        int n = str.length();
        if (n == 1) {
            System.out.println("==>> Minium operation required is 1");
            return;
        }
        int l = 0;
        int h = n;
        while (l <= h) {
            int mid = (l + h) / 2 - 1;   //o+7/2 -1 =2
            if (str.substring(0, mid + 1).equals(str.substring(mid + 1, 2 * (mid + 1)))) {
                int operation = mid + 1 + 1 + (n - 2 * (mid + 1));
                System.out.println("==>> Minimum operation required is :" + operation);
                return;
            }
            h--;
        }
        System.out.println("==>> Minimum operation required is " + n);
    }
}
