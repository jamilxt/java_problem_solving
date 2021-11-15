package com.jamilxt.course.pluralsight.implementingconcurrencyinjava.chapter2;

public class SleepInterruptJoin {
    public static void main(String[] args) {
        Thread threadOne = new Thread(new AnotherRunThread());
        threadOne.start();
        threadOne.interrupt();
        try {
            threadOne.join(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread threadTwo = new Thread(new AnotherRunThread());
        threadTwo.start();
    }
}
