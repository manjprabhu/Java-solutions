package com.mnj.java_solutions.tasks

class DifferentNumberInTwoArrays {

    fun differentNumberInTwoArrays() {
        val arrOne = intArrayOf(1, 2, 3, 4, 5)
        val arrTwo = intArrayOf(2, 4, 6, 8, 10)
        val set = HashSet<Int>()

        for (ele in arrOne)
            set.add(ele)

        for (ele in arrTwo){
             if(set.contains(ele))
                 set.remove(ele)
        else
            set.add(ele)
        }
        for (ele in set)
            println("==>> Unique element : $ele")
    }
}