package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment4;

/**
 * @author jamilxt
 * @created 11 Nov, 2021
 */
public class Question1 {
    public static void main(String[] args) {
        int penguin = 50, turtle = 75;
        boolean older = penguin >= turtle;
        if (older = true) System.out.println("Success");
        else System.out.println("Failure");
//        else if (penguin != 50) System.out.println("Other");
        /*
        Line 13 starts with an else statement,
        but there is no preceding if statement that it matches.
        For this reason, line 13 does not compile,
        making option F the correct answer.
        If the else keyword was removed from line 19,
        then the code snippet would print Success.
         */
    }
}



