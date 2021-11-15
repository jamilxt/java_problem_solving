package com.jamilxt.course.pluralsight.implementingconcurrencyinjava.chapter2;

public class App {
    public static void main(String[] args) {
        // first way
        Thread threadOne = new Thread();
        threadOne.start();

        // second way - Runnable interface
        Thread threadSecond = new Thread(() -> System.out.println("Runnable: " + Thread.currentThread().getId()));
        threadSecond.start();
        System.out.println("Main: " + Thread.currentThread().getId());

        // third way - extending Thread class, overriding run() method
        CustomThread customThread = new CustomThread();
        customThread.start();
    }
}
