package com.mnj.java_solutions.linkedlist;

public class DeleteMiddleElement {

    public void deleteMiddle() {
        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        System.out.println("==>> Linked list before operation");
        node.display(head);

        ListNode.Node fast = head;
        ListNode.Node slow = head;

        if (head == null || head.next == null) {
            return;
        }

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow.data = slow.next.data;
        slow.next = slow.next.next;


        System.out.println("==>> Linked list after deleting middle element .....");
        node.display(head);
    }
}
