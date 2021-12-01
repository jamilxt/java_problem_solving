package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment8;

/**
 * @author jamilxt
 * @created 26 Nov, 2021
 */
class Monkey extends Primate {
    public static void drink() throws RuntimeException {}   // drink() in Mammal is correctly hidden here
    public Number dance(CharSequence p) { return null; }    // dance() in Mammal is correctly overrloaded
//    public int eat(String p) {}
}
