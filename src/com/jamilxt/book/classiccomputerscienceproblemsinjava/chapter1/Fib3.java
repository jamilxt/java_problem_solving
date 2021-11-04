package com.jamilxt.book.classiccomputerscienceproblemsinjava.chapter1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jamilxt
 * @created 03 Nov, 2021
 */
public class Fib3 {

    // Memoization is technique in which you store the results of
    // computational tasks when they are completed so that
    // when you need them again, you can look up instead of needing
    // to compute them a second (or millionth) time.

    // Map.of() was introduced in Java 9 but returns
    // an immutable Map
    // This creates a map with 0->0 and 1->1
    // which represent our base cases
    static Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1, 1));
    static int totalCalls = 0;

    private static int fib3(int n) {
        totalCalls++;
        if (!memo.containsKey(n)) {
            // memoization step
            memo.put(n, fib3(n - 1) + fib3(n - 2));
        }
        return memo.get(n);
    }

    public static void main(String[] args) {
        System.out.println(fib3(40));
        System.out.println(totalCalls);
    }
}
