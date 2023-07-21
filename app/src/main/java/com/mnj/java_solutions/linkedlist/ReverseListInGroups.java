package com.mnj.java_solutions.linkedlist;

public class ReverseListInGroups {

    public void reverseListInGroup() {

        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        int k = 3;
        int count;

        ListNode.Node curr = head;
        ListNode.Node prev;
        ListNode.Node temp;

        ListNode.Node newHead = null;
        ListNode.Node join;
        ListNode.Node tail = null;

        //Traverse till the end of the list
        while (curr != null) {
            count = k;
            join = curr;
            prev = null;

            //Reverse group of k nodes.
            while (curr != null && count > 0) {
                temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
                count--;
            }
           // 4,5,6,7,15,5,4,11

            System.out.println("==>> Count:" + count);
            System.out.println("==>> prev.data:" + prev.data);
            System.out.println("==>> join.data:" + join.data);


            // Sets the new head of the list.
            if (newHead == null) {
                newHead = prev;
            }

            /* Tail pointer keeps track of the last node of the k-reversed linked list. We join the
               tail pointer with the head of the next  k-reversed linked list's head */

            if (tail != null) {
                tail.next = prev;
            }

            /* The tail is then updated to the last node of the next k-reverse linked list */
            tail = join;

            System.out.println("==>> tail.data:" + tail.data);
            System.out.println("==>> newHead.data:" + newHead.data);
        }
        // newHead is new head of the input list
        node.display(newHead);
    }

}
