package com.mnj.java_solutions

class MostFrequentEvenNumber {

    fun getMostFrequentEvenNumber() {
        val a = intArrayOf(1,2,2,3,4,6,7,1,2,2,2) //{4,4,4,9,2,4};//{0, 1, 2, 2, 4, 4, 1};

        val count = IntArray(100001)
        var frequency = 0
        var number = 0

        for (i in a)
            count[i]++

        for (i in count.indices) {
            if (i % 2 == 0 && count[i] > frequency) {
                frequency = count[i]
                number = i
            }
        }
        println("==>> Most frequent even number is : $number and frequency is :$frequency")
    }
}