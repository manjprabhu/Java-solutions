package com.mnj.java_solutions.linkedlist;

public class MergeNodesinBetweenZerosLC2181 {

    /*
    * Input: head = [0,3,1,0,4,5,2,0]
    Output: [4,11]
    Explanation:
    The above figure represents the given linked list. The modified list contains
    - The sum of the nodes marked in green: 3 + 1 = 4.
    - The sum of the nodes marked in red: 4 + 5 + 2 = 11.*/

    public void mergeNodes() {
        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node result_node = new ListNode.Node(0);
        ListNode.Node result_ptr = result_node;
        ListNode.Node temp = head.next;

        int sum = 0;

        while (temp != null && temp.next.next!=null) {
            // Internal loop to find numbers between two 0's
            while (temp.data != 0) {
                sum = sum + temp.data;
                temp = temp.next;
            }

            result_ptr.next = new ListNode.Node(sum);
            result_ptr = result_ptr.next;
            temp = temp.next;
            sum = 0;
        }

        node.display(result_node.next);
    }
}
