package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment4;

/**
 * @author jamilxt
 * @created 11 Nov, 2021
 */
public class Question5 {
    /*
    valid lambda expressions:
    A. j -> {}                                  VALID
    B. q -> return ""
    C. r,w -> r+w
    D. (final var p, final var v) -> 1;         VALID
    E. (y,w) -> { String w = null; return y; }
    F. (var j, int k) -> { return "exit"; }

     */

    /*
    Option A and D are valid lambda expressions.
    Variables in the parameter list of a lambda expression can use the final modifier.
    They can also use var as the type, provided all of the variables use var.
    For this reason,
    option F is also incorrect as it mixes var and non-var variable types.
    Option B is incorrect, as a return statement should be used inside a body with braces {}.
    Option C is incorrect because parentheses are required if there is more than one variable in the parameter list.
    Finally, option E is incorrect because w is declared twice—once in the parameter list and once inside the lambda body.
     */
}
