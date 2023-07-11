package com.mnj.java_solutions.linkedlist;

public class LinkedListCycle {

    public void hasCycle() {
        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node fast = head;
        ListNode.Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                System.out.println("===>> Linked list has cycle");
                return;
            }
        }
        System.out.println("===>> Linked list has NO cycle");
    }
}
