package com.mnj.java_solutions.array

class ThirdMaximumNumberLC414 {

    fun thirdMaximum() {
        val nums = intArrayOf(3, 2, 1)
        var max: Int? = null
        var second_max: Int? = null
        var third_max: Int? = null
        for (num in nums) {
            if (num == max || num == second_max || num == third_max) {
                continue
            }
            if (max == null || num > max) {
                third_max = second_max
                second_max = max
                max = num
            } else if (second_max == null || num > second_max) {
                third_max = second_max
                second_max = num
            } else if (third_max == null || num > third_max) {
                third_max = num
            }
        }
        if (third_max == null) {
            third_max = max
        }
        println("==>>Third maximum element is:$third_max")
    }
}