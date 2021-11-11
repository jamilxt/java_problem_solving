package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment4;

import java.util.Arrays;

/**
 * @author jamilxt
 * @created 11 Nov, 2021
 */
public class Question4 {
    public static void main(String[] args) {
        String[] s1 = {"Camel", "Peacock", "Llama"};
        String[] s2 = {"Camel", "Llama", "Peacock"};
        String[] s3 = {"Camel"};
        String[] s4 = {"Camel", null};

        System.out.println("A: " + Arrays.compare(s1, s2));     // 4
        System.out.println("B: " + Arrays.mismatch(s1, s2));    // 1
        System.out.println("C: " + Arrays.compare(s3, s4));     // -1
        System.out.println("D: " + Arrays.mismatch(s3, s4));    // 1
        System.out.println("E: " + Arrays.compare(s4, s4));     // 0
        System.out.println("F: " + Arrays.mismatch(s4, s4));    // -1

        /*
        The compare() method returns a positive integer when the arrays are different and s1 is larger.
        This is the case for option A since the element at index 1 comes first alphabetically.
        It is not the case for option C because the s4 is longer or option E because the arrays are the same.

         The mismatch() method returns a positive integer when the arrays are different in a position index 1 or greater.
         This is the case for option B since the difference is at index 1.
         It is not the case for option D because the difference is at index 0 or option F because there is no difference.
         */
    }
}
