package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment2;

/**
 * @author jamilxt
 * @created 09 Nov, 2021
 */
public class Ticket {
    public static void main(String[] args) {
        int ticketsTaken = 1;
        int ticketsSold = 3;
        ticketsSold += 1 + ticketsTaken++;
        ticketsTaken *= 2;
        ticketsSold += (long) 1;

        System.out.println(ticketsTaken);   // 4
        System.out.println(ticketsSold);    // 6
    }
}
