package com.jamilxt.book.classiccomputerscienceproblemsinjava.chapter1;

/**
 * @author jamilxt
 * @created 03 Nov, 2021
 */
// 1.1.1 A first recursive attempt
public class Fib1 {

    // This method will cause a java.lang.StackOverflowError
    private static int fib1(int n) {
        return fib1(n - 1) + fib1(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib1(5));
    }
}
