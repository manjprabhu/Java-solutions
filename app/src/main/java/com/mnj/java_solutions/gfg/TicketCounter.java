package com.mnj.java_solutions.gfg;

import java.util.ArrayDeque;

public class TicketCounter {


    //Using ArrayDeque

    //    time complexity O(N) & space complexity O(N)
    public void distributeTicket() {

        int N = 9;
        int k = 3;

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= N; i++)
            dq.add(i);

        boolean flag = true;
        int result = 0;
        while (!dq.isEmpty()) {

            int counter = 0;
            if (flag) {
                while (!dq.isEmpty() && counter < k) {
                    result = dq.pollFirst();
                    counter++;
                }

            } else {
                while (!dq.isEmpty() && counter < k) {
                    result = dq.pollLast();
                    counter++;
                }

            }
            flag = !flag;
        }
        System.out.println("==>> Last element :" + result);
    }

    public void distributeTicketTwo() {
        int N = 14;
        int k = 9;

        int start = 0;
        int end = N;

        while (start < end) {

            int counter = k;
            while (start < end && counter-- >= 0) {
                start++;
            }
            counter = k;
            while (start < end && counter-- >= 0) {
                end--;
            }
        }

        System.out.println("==>> Last element :" + start);

    }
}
