package com.mnj.java_solutions.array;

/**
 * You are given an integer array bloomDay, an integer m and an integer k.
 * <p>
 * You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.
 * <p>
 * The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then can be used in exactly one bouquet.
 * <p>
 * Return the minimum number of days you need to wait to be able to make m bouquets from the garden. If it is impossible to make m bouquets return -1.
 * <p>
 * Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
 * Output: 3
 * Explanation: Let us see what happened in the first three days. x means flower bloomed and _ means flower did not bloom in the garden.
 * We need 3 bouquets each should contain 1 flower.
 * After day 1: [x, _, _, _, _]   // we can only make one bouquet.
 * After day 2: [x, _, _, _, x]   // we can only make two bouquets.
 * After day 3: [x, _, x, _, x]   // we can make 3 bouquets. The answer is 3.
 * <p>
 * https://www.youtube.com/watch?v=oYE6wuYhqZE
 */

public class MinimumNumberDaysMakeBouquetsLC1482 {

    public void minDays() {
        int[] arr = {1, 10, 3, 10, 2};
        int k = 1;
        int m = 3;

        /**
         * To create m bouquets with k adjacent flowers each,
         * we require a minimum of m*k flowers in total. If the number of flowers in the array,
         * represented by array-size, is less than m*k,
         * it becomes impossible to form m bouquets even after all the flowers have bloomed**/
        if (arr.length < (m * k)) {
            System.out.println("==>> Cannot make m bouquets");
            return;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for (int i = min; i < max; i++) {
            if (possible(arr, i, k, m)) {
                System.out.println("==>> Minimum number of days required to make m bouquet :" + i);
                return;
            }
        }
        System.out.println("==>> Cannot make m bouquets");
    }

    //Using binary search
    public void minDays2() {
        int[] arr = {1, 10, 3, 10, 2};
        int k = 1;
        int m = 3;


        if (arr.length < (m * k)) {
            System.out.println("==>> Cannot make m bouquets");
            return;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Apply binary search:
        int result = -1;
        int low = min, high = max;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (possible(arr, mid, k, m)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (low == -1) {
            System.out.println("==>> 2 Cannot make m bouquets");
        } else {
            System.out.println("==>> 2 Minimum number of days required to make m bouquet :" + result);
        }

    }

    private boolean possible(int[] arr, int day, int flowers, int boq) {
        int adj = 0;// How many flowers bloomed on the given day.
        int bc = 0;// denotes how many bouquet can be made on the given day

        for (int j : arr) {
            // flower is bloomed
            if (j <= day) {
                adj++;// on any day if flower is bloomed , increment the count
                if (adj == flowers) { // if total number of adjacent flowers are equal to minimum number of flower in bouqet (i.e k)
                    bc++;  // Create a bouquet (increment the bouquet count)
                    if (bc == boq) // If number of bouqut that can be created on 'day' is equal to target number of bouquet then return true
                        return true;
                    adj = 0; // reset the adjacent  bloomed flowers( they are already used in creating bouquet)
                }
            } else // flower is not bloomed.
                adj = 0;
        }
        return false;
    }
}
