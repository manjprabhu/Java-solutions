package com.mnj.java_solutions.linkedlist

import java.util.*

class PrintReverse {
    fun solutionOne() {
        val node = ListNode()
        val head = node.insert()
        var temp = head
        val stack = Stack<Int>()
        while (temp != null) {
            stack.push(temp.data)
            temp = temp.next
        }
        while (!stack.isEmpty()) {
            println("==>> " + stack.pop())
        }
    }

    fun solutionTwo() {
        val node = ListNode()
        val head = node.insert()
        reverse(head)
    }

    private fun reverse(head: ListNode.Node) {
        if (head.next == null) return
        reverse(head.next)
        println("==>> Reverse List:" + head.data)
    }
}