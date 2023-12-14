package com.mnj.java_solutions.linkedlist

import com.mnj.java_solutions.linkedlist.ListNode

class MoveLastElementToFirst {
    fun move() {
        val node = ListNode()
        val head = node.insert()
        if (head.next == null) {
            println("==>> Only one node")
            return
        }
        var temp = head

        //traverse the list until 2nd last element
        while (temp.next.next != null) {
            temp = temp.next
        }

        //save the last node.
        val last = temp.next

        //temp will be new last node so mark next of temp to zero.
        temp.next = null
        last.next = head
        node.display(last)
    }
}