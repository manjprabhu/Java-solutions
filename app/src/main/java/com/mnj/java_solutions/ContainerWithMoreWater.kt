package com.mnj.java_solutions

class ContainerWithMoreWater {
    /* You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith
    line are (i, 0) and (i, height[i]).

    Find two lines that together with the x-axis form a container, such that the container contains the most water.

    Return the maximum amount of water a container can store.*/
    /* Area = length             *      width
           min(left, right)   *      (right-left)*/
    fun containerWithMoreWater() {
        val height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
        var maxArea = 0
        var areaSoFar: Int
        var i = 0
        var j = height.size - 1
        while (i < j) {
            val length = Math.min(height[i], height[j])
            val width = j - i
            areaSoFar = length * width
            maxArea = Math.max(maxArea, areaSoFar)
            if (height[i] < height[j]) {
                i++
            } else {
                j--
            }
        }
        println("==>> Max area so of the container is :$maxArea")
    }
}