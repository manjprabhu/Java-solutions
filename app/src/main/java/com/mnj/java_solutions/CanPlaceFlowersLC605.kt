package com.mnj.java_solutions

class CanPlaceFlowersLC605 {
    fun canPlaceFlower() {
        var plantSoFar = 0
        val flowerBed = intArrayOf(1, 0, 0, 0, 1)
        val plant = 2
        for (i in flowerBed.indices) {
            if (flowerBed[i] == 0) {
                val prev = if (i == 0 || flowerBed[i - 1] == 0) 0 else 1
                val next = if (i == flowerBed.size - 1 || flowerBed[i + 1] == 0) 0 else 1
                if (prev == 0 && next == 0) {
                    flowerBed[i] = 1
                    plantSoFar++
                }
            }
        }
        if (plantSoFar == plant) println("==>> Can plant flowers") else println("==>> Can NOT plant flowers")
    }
}
