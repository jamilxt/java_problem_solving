package com.jamilxt.course.pluralsight.implementingconcurrencyinjava.chapter2;

import java.util.concurrent.Callable;

public class CallThread implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        System.out.println("In Call.");
        return new Object();
    }
}
