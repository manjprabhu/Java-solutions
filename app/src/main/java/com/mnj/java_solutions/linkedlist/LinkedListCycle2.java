package com.mnj.java_solutions.linkedlist;

public class LinkedListCycle2 {

    //Check if LinkedList has cycle or not and return the cycle starting point

    public void hasCycle() {
        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node fast = head;
        ListNode.Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                slow = head;
                while (slow != fast) {
                    fast = fast.next;
                    slow = slow.next;
                }
                System.out.println("==>> Cycle starts at:" + slow.data);
                return;
            }

        }

    }
}
