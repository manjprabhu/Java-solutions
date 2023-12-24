package com.mnj.java_solutions.gfg

class TransitionPoint {
    fun transitionPoint() {
        val a = intArrayOf(0, 0, 0, 0, 1, 1, 1, 1)
        var low = 0
        var high = a.size - 1
        var tp = -1
        while (low <= high) {
            val mid = low + (high - low) / 2
            if (a[mid] == 0) {
                low = mid + 1
            } else if (a[mid] == 1) {
                high = mid - 1
                tp = mid
            }
        }
        println("==>>> Transition point :$tp")
    }
}