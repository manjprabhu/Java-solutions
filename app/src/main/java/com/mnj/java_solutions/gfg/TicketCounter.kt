package com.mnj.java_solutions.gfg

import java.util.ArrayDeque

class TicketCounter {
    //Using ArrayDeque
    //    time complexity O(N) & space complexity O(N)
    fun distributeTicket() {
        val N = 9
        val k = 3
        val dq = ArrayDeque<Int>()
        for (i in 1..N) dq.add(i)
        var flag = true
        var result = 0
        while (!dq.isEmpty()) {
            var counter = 0
            if (flag) {
                while (!dq.isEmpty() && counter < k) {
                    result = dq.pollFirst()
                    counter++
                }
            } else {
                while (!dq.isEmpty() && counter < k) {
                    result = dq.pollLast()
                    counter++
                }
            }
            flag = !flag
        }
        println("==>> Last element :$result")
    }

    fun distributeTicketTwo() {
        val N = 14
        val k = 9
        var start = 0
        var end = N
        while (start < end) {
            var counter = k
            while (start < end && counter-- >= 0) {
                start++
            }
            counter = k
            while (start < end && counter-- >= 0) {
                end--
            }
        }
        println("==>> Last element :$start")
    }
}