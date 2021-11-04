package com.jamilxt.book.classiccomputerscienceproblemsinjava.chapter1;

/**
 * @author jamilxt
 * @created 03 Nov, 2021
 */
public class Fib2 {
    // Without Memoization Technique

    static int totalCalls = 0;

    private static int fib2(int n) {
        totalCalls++;
        if (n < 2) return n;
        return fib2(n - 1) + fib2(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib2(40)); // 102334155
        System.out.println(totalCalls); // 331160281
    }
}
