package com.jamilxt.course.pluralsight.implementingconcurrencyinjava.chapter2;

public class AnotherRunThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Current thread id: " + Thread.currentThread().getId() + " i: " + i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
                // break;
            }
        }
    }
}
