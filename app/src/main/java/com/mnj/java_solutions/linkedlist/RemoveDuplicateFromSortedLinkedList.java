package com.mnj.java_solutions.linkedlist;

/**
 * Given a singly linked list consisting of N nodes.
 * The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).
 * Note:The nodes are arranged in a sorted way.
 * <p>
 * LinkedList: 2->2->4->5
 * Output: 2 4 5
 * Explanation: In the given linked list
 * 2 ->2 -> 4-> 5, only 2 occurs more
 * than 1 time. So we need to remove it once.
 **/
public class RemoveDuplicateFromSortedLinkedList {

    public void removeDuplicate() {
        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node current = head;
        ListNode.Node ptr = head;

        while (current != null) {
            ListNode.Node temp = current;

            while (temp != null && temp.data == current.data) {
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;
        }
        node.display(ptr);
    }

    public void removeDuplicate2() {
        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node prev = head;
        ListNode.Node temp = prev.next;
        ListNode.Node ptr = head;

        while (temp != null) {
            //Don't do anything if current element (temp) and prev element are same
            if (temp.data == prev.data) {
                temp = temp.next;
                continue;
            }
            prev.next = temp;
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        node.display(ptr);
    }
}
