package com.mnj.java_solutions

import java.util.ArrayList

class GreatestNumberOfCandies {
    fun kidsWithCandies() {
        val candies = intArrayOf(2, 3, 5, 1, 3)
        val extraCandies = 3
        var max = Int.MIN_VALUE
        val list: Any? = ArrayList<Any?>()
        for (candy in candies) {
            max = Math.max(max, candy)
        }
        for (candy in candies) {
            list.add(extraCandies + candy >= max)
        }
        for (candy in list) {
            println("==>>  Item:$candy")
        }
    }
}