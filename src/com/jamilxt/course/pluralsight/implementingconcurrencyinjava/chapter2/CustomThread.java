package com.jamilxt.course.pluralsight.implementingconcurrencyinjava.chapter2;

public class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println("I'm a custom thread!");
    }
}
