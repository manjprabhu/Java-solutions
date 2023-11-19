package com.mnj.java_solutions.linkedlist;

/**
 *
 * Given two linked lists sorted in increasing order, create a new linked list representing the intersection of the two linked lists. The new linked list should be made with without changing the original lists.
 *
 * Note: The elements of the linked list are not necessarily distinct.
 *
 * Example 1:
 *
 * Input:
 * LinkedList1 = 1->2->3->4->6
 * LinkedList2 = 2->4->6->8
 * Output: 2 4 6
 * Explanation: For the given two
 * linked list, 2, 4 and 6 are the elements
 * in the intersection.
 * Example 2:
 *
 * Input:
 * LinkedList1 = 10->20->40->50
 * LinkedList2 = 15->40
 * Output: 40
 *
 * **/
public class IntersectionOf2SortedLinkedList19112023 {

    public void findIntersection() {
        ListNode node1 = new ListNode();
        ListNode.Node head1 = node1.insert();

        ListNode node2 = new ListNode();
        ListNode.Node head2 = node2.insert();

        ListNode.Node ans = new ListNode.Node(-1);
        ListNode.Node temp = ans;

        while (head1 != null && head2 != null) {

            if (head1.data == head2.data) {
                temp.next = new ListNode.Node(head1.data);
                temp = temp.next;
                head1 = head1.next;
                head2 = head2.next;
            } else if (head1.data > head2.data) {
                head2 = head2.next;
            } else {
                head1 = head1.next;
            }
        }
        node1.display(ans);
    }
}
