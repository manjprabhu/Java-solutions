package com.mnj.java_solutions.linkedlist;

public class RotateListRight {

  /* 1 -> -> 2-> 3 -> 4-> 5
     after rotate right by 2
     4-> 5 -1 -> -> 2-> 3

     5 -> next = null     5-> next  = head
     3-> next = 4         3-> next = null
     head = 1             head= 4
     */

    public void rotateRight() {

        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        int length = 1;
        int k= 2;

        ListNode.Node newHead = head;
        ListNode.Node tail = head;
        ListNode.Node Newtail = head;

        if(head==null)
            return;

        while (tail.next != null) {
            length++;
            tail = tail.next;
        }

        //Now tail is at last node (5) so change the tail next to head;
        tail.next = head;

         k %= length;
// Now change next of (3) to null; to do that traverse the list till node 3

        for( int i =1;i<length-k;i++) {
            Newtail = Newtail.next;

        }

//        Node 4 is going to be new head, so before marking node3 next to null , save node3 next to  new head;
         newHead=  Newtail.next;

        //tail is currently at node 3 which is going to be new last node(after rotate by 2) so mark tail of next to null;
        Newtail.next = null;

        node.display(newHead);
    }
}
