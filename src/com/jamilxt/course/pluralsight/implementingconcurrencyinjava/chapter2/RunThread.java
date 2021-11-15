package com.jamilxt.course.pluralsight.implementingconcurrencyinjava.chapter2;

public class RunThread implements Runnable{
    @Override
    public void run() {
        System.out.println("In runnable run method.");
    }
}
