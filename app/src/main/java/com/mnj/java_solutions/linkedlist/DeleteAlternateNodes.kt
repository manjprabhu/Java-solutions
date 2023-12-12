package com.mnj.java_solutions.linkedlist

import com.mnj.java_solutions.linkedlist.ListNode

class DeleteAlternateNodes {
    fun deleteNodes() {
        val node = ListNode()
        val head = node.insert()
        var temp = head
        while (temp?.next != null) {
            temp.next = temp.next.next
            temp = temp.next
        }
        println("==>> After operation.....")
        node.display(head)
    }
}