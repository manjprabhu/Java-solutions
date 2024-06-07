package com.mnj.java_solutions

class NumberToWord {

    private val LESS_THAN_20 = arrayOf(
        "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"
    )

    private val TENS = arrayOf(
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
        "Seventy", "Eighty", "Ninety"
    )

    private val THOUSANDS = arrayOf("", "Thousand", "Million", "Billion")

    fun numberToWord() {
        val input = 12345
        if (input == 0)
            println("==>> Result : zero")

        var num = input
        var i = 0
        var words = ""
        while (num > 0) {
            if (num % 1000 != 0) {
                words = helper(num % 1000) + THOUSANDS[i] + " " + words
            }
            num /= 1000
            i++
        }
        println("==>> Result : ${words.trim()}")
    }

    private fun helper(num: Int): String {
        return if (num == 0) ""
        else if (num < 20) LESS_THAN_20[num] + " "
        else if (num < 100) TENS[num / 10] + " " + helper(num % 10)
        else LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100)
    }
}