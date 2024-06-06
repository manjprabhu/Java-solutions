package com.mnj.java_solutions.tasks

class CommonBetweenTwoArrays {

    fun commonElementApproachOne() {
        val arrOne = intArrayOf(1, 2, 3, 4, 5)
        val arrTwo = intArrayOf(2, 4, 6, 8, 10)

        for (ele in arrOne) {
            for (eleTwo in arrTwo) {
                if (ele == eleTwo) {
                    println("==>> Common Element : $ele")
                }
            }
        }
    }

    fun commonElementApproachTwo() {
        val arrOne = intArrayOf(1, 2, 3, 4, 5)
        val arrTwo = intArrayOf(2, 4, 6, 8, 10)
        val set = HashSet<Int>()

        for (ele in arrOne)
            set.add(ele)

        for (ele in arrTwo)
            if (set.contains(ele))
                println("==>> 2: Common Element : $ele")
    }
}