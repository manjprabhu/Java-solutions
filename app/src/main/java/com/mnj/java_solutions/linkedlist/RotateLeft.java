package com.mnj.java_solutions.linkedlist;

public class RotateLeft {


    public void rotateLeft() {

        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node temp = head;
        ListNode.Node last =null;

        int count  = 1;
        int k = 2;

        while (temp.next!=null) {
            if(count == k)
                last = temp;
            count++;
            temp = temp.next;
        }

        if(k < count) {
            temp.next = head;
            head = last.next;
            last.next = null;
        }

        node.display(head);
    }
}
