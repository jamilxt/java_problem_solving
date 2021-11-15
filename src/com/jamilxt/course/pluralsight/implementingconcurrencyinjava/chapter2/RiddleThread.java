package com.jamilxt.course.pluralsight.implementingconcurrencyinjava.chapter2;

public class RiddleThread extends Thread {
    @Override
    public void run() {
        System.out.println("I'm the task of CustomThread!");
        System.out.println("The thread id in task is: " + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        RiddleThread riddleThread = new RiddleThread();
        riddleThread.run(); // run() doesn't create new thread
        System.out.println("The thread id in main is: " + Thread.currentThread().getId());

        /*
        Because there is only one thread and it's going to be executed just in the order the code is being written.
         */
    }
}
