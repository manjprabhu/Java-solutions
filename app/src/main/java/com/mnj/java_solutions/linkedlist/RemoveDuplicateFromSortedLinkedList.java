package com.mnj.java_solutions.linkedlist;

public class RemoveDuplicateFromSortedLinkedList {

    public void removeDuplicate() {
        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node prev = head;
        ListNode.Node temp = prev.next;


        while (temp != null) {
            //Dont do anything if current element (temp) and prev element are same
            if (temp.data == prev.data) {
                temp = temp.next;
                continue;
            }
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }
}
