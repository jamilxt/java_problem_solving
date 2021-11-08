package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment1;

/**
 * @author jamilxt
 * @created 08 Nov, 2021
 */
public class Help {
    public void callSuperhero() {
//        try (String raspberry = new String("Olivia")) {
//            System.out.print("Q");
//        } catch (Error e) {
//            System.out.print("X");
//        } finally {
//            System.out.print("M");
//        }
    }

    public static void main(String[] args) {
        new Help().callSuperhero();
        System.out.print("S");
    }

    /*
    The class does not compile because String does not implement AutoCloseable.
     */
}
