package com.jamilxt.book.classiccomputerscienceproblemsinjava.chapter1.fib;

/**
 * @author jamilxt
 * @created 05 Nov, 2021
 */
// 1.1.4 Keep it simple, Fibonacci
public class Fib4 {
    static int totalCalls = 0;

    private static int fib4(int n) {
        int last = 0, next = 1; // fib(0), fib(1)
        for (int i = 0; i < n; i++) {
            int oldLast = last;
            last = next;
            next = oldLast + next;
        }
        totalCalls++;
        return last;
    }

    public static void main(String[] args) {
        System.out.println(fib4(40)); // 102334155
        System.out.println(totalCalls); // 1
    }
}
