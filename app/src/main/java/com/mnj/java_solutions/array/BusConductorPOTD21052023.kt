package com.mnj.java_solutions.array

import java.util.*

class BusConductorPOTD21052023 {
    fun busConductor() {
        val chairs = intArrayOf(2, 2, 6, 6)
        val passenger = intArrayOf(1, 3, 2, 6)
        Arrays.sort(chairs)
        Arrays.sort(passenger)
        var result = 0
        for (i in chairs.indices) {
            result += Math.abs(chairs[i] - passenger[i])
        }
        println("==>> Result: $result")
    }
}