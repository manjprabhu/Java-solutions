package com.mnj.java_solutions.linkedlist;

/**
 * Given the head of a linked list, return the node where the cycle begins.
 * If there is no cycle, return null.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
 *
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed).
 *
 * It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 **/
public class LinkedListCycleLC142 {

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
