package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment7;

/**
 * @author jamilxt
 * @created 26 Nov, 2021
 */
public interface HeatQuickly extends Heat {
    abstract int heat();
    private static int turnOn() { return 1; }
    default void turnOff() {
        throw new UnsupportedOperationException();
    }
    abstract boolean equal(Object o);
}
