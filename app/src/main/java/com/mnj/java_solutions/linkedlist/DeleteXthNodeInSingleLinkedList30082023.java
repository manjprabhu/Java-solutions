package com.mnj.java_solutions.linkedlist;

public class DeleteXthNodeInSingleLinkedList30082023 {

    public void deleteNode() {
        int x = 3;

        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node temp = head;

        if (head == null) {
            System.out.println("==>> Empty linked list");
            return;
        }
        if (x == 1) {
            node.display(head.next);
        }

        for (int i = 1; i < x - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        node.display(head);
    }
}
