package com.mnj.java_solutions.linkedlist;

/**
 * Three 90 Challenge Extended On Popular Demand! Don't Miss Out Now
 *
 * banner
 * Given a sorted circular linked list of length n, the task is to insert a new node in this circular list so that it remains a sorted circular linked list.
 *
 * Example 1:
 *
 * Input:
 * n = 3
 * LinkedList = 1->2->4
 * (the first and last node is connected, i.e. 4 --> 1)
 * data = 2
 * Output:
 * 1 2 2 4
 * Explanation:
 * We can add 2 after the second node.
 * Example 2:
 *
 * Input:
 * n = 4
 * LinkedList = 1->4->7->9
 * (the first and last node is connected, i.e. 9 --> 1)
 * data = 5
 * Output:
 * 1 4 5 7 9
 * Explanation:
 * We can add 5 after the second node.
 * **/
public class SortedInsertForCircularLinkedList05022024 {

    public void insertNode() {
        int data = 10;
        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node curr = head;
        ListNode.Node newNode  = new ListNode.Node(data);


        if(head ==null){
            newNode.next = newNode;
            node.display(newNode);
        }

        else if(data <= head.data){
            while(curr.next!=head)
                curr=curr.next;

            curr.next = newNode; newNode.next = head;
            node.display(newNode);
        }

        else{
            while(curr.next!=head && data > curr.next.data){
                curr=curr.next;
            }

            newNode.next = curr.next;
            curr.next = newNode;
            node.display(head);
        }
    }
}
