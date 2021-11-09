package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment3;

import java.util.Comparator;

/**
 * @author jamilxt
 * @created 09 Nov, 2021
 */
public class Cook {
    static class Vegetable {
        float vitamins() {
            return 8f;
        }
    }

    final class Carrot extends Vegetable {
        final float vitamins() {
            return 4;
        }
    }

    public static void main(String[] args) {
//        final Carrot carrot = new Cook().new Carrot() {
//        };
//        System.out.println(carrot.vitamins());
    }

    /*
    The Carrot class is marked final, but the anonymous class declared on line 9 attempts to extend it.
    For this reason, the code does not compile.
    Since this is the only compilation error, option C is correct.
    If the final modifier was removed from line 5,
    then the code would compile and print 4.0 at runtime.
    For the exam, make sure you understand that it is line 9, not line 5,
    that reports the compilation error.
     */

    public static void swim(String color, Comparator<String> comparator) {

//         String color = "blue";
        String otherColor = "gray";
//         comparator = (color, color2) -> color.compareTo(color2);
//         comparator = (otherColor, color2) -> color.compareTo(color2);
    }

     /*
     A variable name may not be used as a method parameter and a local variable.
     This means line 40 must be commented out.
     A method parameter also may not be used as a lambda requiring line 42 to be commented out.
     Finally,
     a local variable may not be used as a lambda variable in the same scope requiring one of line 41 or 43 to be commented out.
     Since three lines must be commented out,
     option D is correct.
      */

}
