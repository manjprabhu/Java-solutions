package com.mnj.java_solutions.tasks

class NumberThatAppearAtleastTwiceArray {

    fun numberAppearance() {
        val arr = intArrayOf(2, 2, 2, 5, 1, 1, 1, 1, 2, 2, 2, 7, 9, 6, 5, 5)
        val map = HashMap<Int,Int>()

        for (ele in arr) {
            map[ele] = map.getOrDefault(ele, 0)+1
        }

        for(ele in map)
            if(ele.value >=2)
                println("==>> Element ${ele.key} appears more than twice")
    }
}