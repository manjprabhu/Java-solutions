package com.mnj.java_solutions.linkedlist;

/**
 * iven a linked list, you have to perform the following task:
 *
 * Extract the alternative nodes starting from second node.
 * Reverse the extracted list.
 * Append the extracted list at the end of the original list.
 * Note: Try to solve the problem without using any extra memory.
 *
 * Example 1:
 *
 * Input:
 * LinkedList = 10->4->9->1->3->5->9->4
 * Output:
 * 10 9 3 9 4 5 1 4
 * Explanation:
 * Alternative nodes in the given linked list are 4,1,5,4. Reversing the alternative nodes from the given list, and then appending them to the end of the list results in a list 10->9->3->9->4->5->1->4.
 * Example 2:
 *
 * Input:
 * LinkedList = 1->2->3->4->5
 * Output:
 * 1 3 5 4 2
 * Explanation:
 * Alternative nodes in the given linked list are 2 and 4. Reversing the alternative nodes from the given list, and then appending them to the end of the list results in a list 1->3->5->4->2.
 * **/
public class ReverseAlternateNodesInLinkList06102023 {

    public void rearrange() {
        ListNode node = new ListNode();
        ListNode.Node odd = node.insert();

        if (odd.next == null)
            return;

        ListNode.Node h1 = odd;
        ListNode.Node h2 = odd.next;
        ListNode.Node t1 = h1;
        ListNode.Node t2 = h2;

        while (true) {
            t1.next = t1.next.next;
            t1 = t1.next;

            if (t2.next.next == null) {
                t1.next = null;
                break;
            }

            t2.next = t1.next;
            t2 = t2.next;

            if (t1.next.next == null) {
                t1.next = null;
                break;

            }
        }

        t2.next = null;
        t1.next = reverse(h2);
    }

    private ListNode.Node reverse(ListNode.Node head) {
        ListNode.Node curr = head;
        ListNode.Node prev = null;

        while (curr != null) {
            ListNode.Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
