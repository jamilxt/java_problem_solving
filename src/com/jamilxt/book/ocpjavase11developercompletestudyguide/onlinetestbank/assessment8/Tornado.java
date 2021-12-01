package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment8;

/**
 * @author jamilxt
 * @created 26 Nov, 2021
 */
public class Tornado {
    static class House implements AutoCloseable {
        @Override
        public void close() throws Exception {
            throw new RuntimeException("Cellar door stuck");
        }

        public void open() {
        }
    }

    public static void main(String[] args) {
        House house1 = new House();
        house1.open();
        try (house1; House house2 = new House()) {
            throw new RuntimeException("House flew away");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " " + e.getSuppressed().length);
        }
        house1.open(); // m1
    }
}
