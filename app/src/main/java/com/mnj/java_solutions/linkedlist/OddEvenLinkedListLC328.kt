package com.mnj.java_solutions.linkedlist

class OddEvenLinkedListLC328 {
    fun oddEvenList() {
        val node = ListNode()
        val head = node.insert()
        var odd = head
        var even = head.next
        val evenHead = even
        while (even?.next != null) {
            odd.next = odd.next.next
            odd = odd.next
            even.next = even.next.next
            even = even.next
        }
        odd.next = evenHead
        node.display(head)
    }
}