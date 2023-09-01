package com.mnj.java_solutions.linkedlist;
/**
 *
 * You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
 *
 * The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.
 *
 * For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
 *
 * **/
public class DeleteMiddleElementLC2095 {

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

       //If there are only 2 nodes
        if(slow.next == null) {
            head.next = null;
            return;
        }
        slow.data = slow.next.data;
        slow.next = slow.next.next;

        System.out.println("==>> Linked list after deleting middle element .....");
        node.display(head);
    }
}
