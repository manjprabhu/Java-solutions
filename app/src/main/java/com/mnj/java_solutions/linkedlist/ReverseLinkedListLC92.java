package com.mnj.java_solutions.linkedlist;

/**
 * Given the head of a singly linked list and two integers left and right where left <= right,
 * reverse the nodes of the list from position left to position right, and return the reversed list
 * <p>
 * Input: head = [1,2,3,4,5], left = 2, right = 4
 * Output: [1,4,3,2,5]
 **/
public class ReverseLinkedListLC92 {

    public void reverse() {
        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        int left = 3;
        int right = 5;


        ListNode.Node dummy = new ListNode.Node(0);
        dummy.next = head;

        // make markers for currentNode and for the node before reversing
        ListNode.Node leftPre = dummy;
        ListNode.Node currNode = head;

        for (int i = 0; i < left - 1; i++) {
            leftPre = leftPre.next;
            currNode = currNode.next;
        }

        // make a marker to node where we start reversing
        ListNode.Node subListHead = currNode;

        ListNode.Node preNode = null;
        for (int i = 0; i <= right - left; i++) {
            ListNode.Node nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }

        // Join the pieces
        leftPre.next = preNode;
        subListHead.next = currNode;


        node.display(dummy.next);

    }
}
