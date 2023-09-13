package com.mnj.java_solutions;

/**
 * Given two numbers 'N' and 'S' , find the largest number that can be formed with 'N' digits and whose sum of digits should be equals to 'S'. Return -1 if it is not possible.
 * <p>
 * Example 1:
 * <p>
 * Input: N = 2, S = 9
 * Output: 90
 * Explaination: It is the biggest number
 * with sum of digits equals to 9.
 * Example 2:
 * <p>
 * Input: N = 3, S = 20
 * Output: 992
 * Explaination: It is the biggest number
 * with sum of digits equals to 20.
 **/
public class LargestNumberPossible13092023 {

    public void findLargest() {

        int n = 2, S = 9;

        StringBuilder ans = new StringBuilder();
        if (S == 0 && n > 1) {
            System.out.println("==>> Not possible");
            return;
        }
        for (int i = 0; i < n; i++) {
            if (S >= 9) {
                ans.append('9');
                S -= 9;
            } else {
                ans.append((char) (S + 48)); //Ascii value of zero is 48
                S = 0;
            }
        }

        //Edge case N =2 and S= 20, maximum number we can place is 9 + 9 = 18, so sum of largest possible digits would be 9 and 9
        // so N=2 and S = 20 combination is not possible
        if (S > 0) // eg N=2, S=20
        {
            System.out.println("==>> Not possible");
            return;
        }

        System.out.println("==>> Result is :" + ans.toString());
    }
}
