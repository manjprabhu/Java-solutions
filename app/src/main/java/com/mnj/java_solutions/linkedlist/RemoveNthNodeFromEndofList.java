package com.mnj.java_solutions.linkedlist;

public class RemoveNthNodeFromEndofList {

    public void removeNthFromEnd() {

        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        int n = 2;

        ListNode.Node temp = head;
        ListNode.Node fast = head;
        ListNode.Node slow = head;

        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        node.display(head);
    }
}
