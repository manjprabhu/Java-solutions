package com.mnj.java_solutions.string;

/**
 * Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating (in any direction) string 'a' by exactly 2 places.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * a = amazon
 * b = azonam
 * Output:
 * 1
 * Explanation:
 * amazon can be rotated anti-clockwise by two places, which will make it as azonam.
 * Example 2:
 * <p>
 * Input:
 * a = geeksforgeeks
 * b = geeksgeeksfor
 * Output:
 * 0
 * Explanation:
 * If we rotate geeksforgeeks by two place in any direction, we won't get geeksgeeksfor.
 **/
public class CheckStringIsRotatedBy2Places12112023 {

    public void isRotated() {
        String str1 = "amazon";
        String str2 = "azonam";

        if (str1.length() != str2.length()) {
            System.out.println("==>> String are not rotated...");
            return;
        }
        boolean a = true, b = true;
        for (int i = 0; i < str2.length(); i++) {
            if (a && (str1.charAt(i) != str2.charAt((i + 2) % str2.length())))
                a = false;

            if (b && (str1.charAt(i) != str2.charAt(((i - 2) + str2.length()) % str2.length())))
                b = false;

            if (!a && !b) {
                System.out.println("==>> String are NOT rotated...");
                return;
            }
        }
        System.out.println("==>> String are rotated...");
    }
}
