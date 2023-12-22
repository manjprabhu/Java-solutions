package com.mnj.java_solutions.string

//Count the number of words in a sentence
class WordCount {
    fun wordCount() {
        val str = "This is testing for word count"
        if (str == null || str.isEmpty()) {
            println("==>> Number of words are zero")
            return
        }
        val words = str.split("\\s").toTypedArray()
        println("==>> Number of words is:" + words.size)
    }
}