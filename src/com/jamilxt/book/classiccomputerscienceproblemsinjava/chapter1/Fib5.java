package com.jamilxt.book.classiccomputerscienceproblemsinjava.chapter1;

import java.util.stream.IntStream;

/**
 * @author jamilxt
 * @created 05 Nov, 2021
 */
// 1.1.5 Generating Fibonacci numbers with a stream
public class Fib5 {
    private int last = 0, next = 1; // fib(0), fib(1)

    public IntStream stream() {
        return IntStream.generate(() -> {
            int oldLast = last;
            last = next;
            next = oldLast + next;
            return oldLast;
        });
    }

    public static void main(String[] args) {
        Fib5 fib5 = new Fib5();
        // the limit() call ensures that the potentially infinite stream
        // stops spewing numbers when it reaches its 41st item.
        fib5.stream().limit(41).forEachOrdered(System.out::println);
    }
}
