package com.mnj.java_solutions.linkedlist

/***
 *
 * Problem
 *
 * Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]

 Solution
 *
 * We start by creating a dummy node called ′start′'start'
′
start
′
and set both ′fast′'fast'
′
fast
′
and′slow′ 'slow'
′
slow
′
pointers to the dummy node.
We move the ′fast′'fast'
′
fast
′
pointer ahead by 'n' steps.
Next, we move both ′fast′'fast'
′
fast
′
and ′slow′'slow'
′
slow
′
pointers until ′fast′'fast'
′
fast
′
reaches the end of the list.
After this traversal, ′slow′'slow'
′
slow
′
will be pointing to the node just before the nth node from the end.
We update the 'next' pointer of′slow′ 'slow'
′
slow
′
to remove the nth node from the end.
and we return the the start.nextstart.nextstart.next , because it was head of given LL.

 */
class RemoveNthNodeFromEndofList {
    fun removeNthFromEnd() {
        val node = ListNode()
        val head = node.insert()
        val n = 2
        var fast = head
        var slow = head

        /**
         *
         *   for (int i = 1; i <= n + 1; i++) {
        fast = fast.next;
        }
         **/
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