package com.mnj.java_solutions.greedy;

public class LemonadeChange {

    //860. Lemonade Change
   /* At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and order
    one at a time (in the order specified by bills). Each customer will only buy one lemonade and pay with
    either a $5, $10, or $20 bill. You must provide the correct change to each customer so that the net
    transaction is that the customer pays $5.

    Note that you do not have any change in hand at first.

    Given an integer array bills where bills[i] is the bill the ith customer pays, return true if
    you can provide every customer with the correct change, or false otherwise.*/


    void lemonadeChange() {
        int[] bills = {5, 5, 5, 10, 20};

        int fives = 0;
        int tens = 0;

        for (int bill : bills) {

            if (bill == 5) {
                fives++;
            } else if (bill == 10) {
                tens++;
                fives--;
            } else if (tens > 0) {
                tens--;
                fives--;
            } else {
                fives = fives - 3;
            }

            if (fives < 0) {
                System.out.println("==>> Cannot provide exact change to every customer.");
                return;
            }
        }
        System.out.println("==>> Can  provide exact change to every customer.");
    }
}