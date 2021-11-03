package com.jamilxt.book.classiccomputerscienceproblemsinjava.chapter1;

/**
 * @author jamilxt
 * @created 03 Nov, 2021
 */
public class Fib2 {

    private static int fib2(int n) {
        if (n < 2) return n;
        return fib2(n - 1) + fib2(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib2(5));    // 0 0 1 1 2
        System.out.println(fib2(10));   // 0 0 1 1 2 3 5 8 13 21
        System.out.println(fib2(40));
    }
}
