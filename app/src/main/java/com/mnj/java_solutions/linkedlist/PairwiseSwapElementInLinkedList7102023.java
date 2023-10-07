package com.mnj.java_solutions.linkedlist;

/**
 * Given a singly linked list of size N. The task is to swap elements in the linked list pairwise.
 * For example, if the input list is 1 2 3 4, the resulting list after swaps will be 2 1 4 3.
 * Note: You need to swap the nodes, not only the data. If only data is swapped then driver will print -1.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * LinkedList: 1->2->2->4->5->6->7->8
 * Output:
 * 2 1 4 2 6 5 8 7
 * Explanation:
 * After swapping each pair considering (1,2), (2, 4), (5, 6)..
 * so on as pairs, we get 2, 1, 4, 2, 6, 5, 8, 7 as a new linked list.
 * Example 2:
 * <p>
 * Input:
 * LinkedList: 1->3->4->7->9->10->1
 * Output:
 * 3 1 7 4 10 9 1
 * Explanation:
 * After swapping each pair considering (1,3), (4, 7), (9, 10)..
 * so on as pairs, we get 3, 1, 7, 4, 10, 9, 1 as a new linked list.
 **/
public class PairwiseSwapElementInLinkedList7102023 {

    public void pairwiseSwap() {

        ListNode node = new ListNode();
        ListNode.Node head = node.insert();
        ListNode.Node result = swap(head);
        node.display(result);
    }

    private ListNode.Node swap(ListNode.Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode.Node temp = node.next;
        node.next = swap(temp.next);
        temp.next = node;
        return node;
    }

    public void pairwiseSwap2() {
        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        if (head == null || head.next == null) {
            node.display(head);
            return;
        }

        ListNode.Node prev = head;
        ListNode.Node curr = head.next;

        head = curr;

        while (true) {
            ListNode.Node next = curr.next;
            curr.next = prev;

            if (next == null || next.next == null) {
                prev.next = next;
                break;
            } else {
                prev.next = next.next;
            }

            prev = next;
            curr = next.next;
        }
        node.display(head);
    }
}
