package com.mnj.java_solutions.linkedlist

import com.mnj.java_solutions.linkedlist.ListNode

class RemoveNthNodeFromEndofList {
    fun removeNthFromEnd() {
        val node = ListNode()
        val head = node.insert()
        val n = 2
        val temp = head
        var fast = head
        var slow = head
        for (i in 1..n + 1) {
            fast = fast!!.next
        }
        while (fast != null) {
            slow = slow.next
            fast = fast.next
        }
        slow.next = slow.next.next
        node.display(head)
    }
}