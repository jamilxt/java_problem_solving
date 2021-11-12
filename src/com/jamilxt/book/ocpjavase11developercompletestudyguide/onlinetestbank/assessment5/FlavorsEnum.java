package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment5;

/**
 * @author jamilxt
 * @created 12 Nov, 2021
 */

public class FlavorsEnum {
    enum Flavors {
        VALIDLA, CHOCOLATE, STRAWBERRY;
        static final Flavors DEFAULT = STRAWBERRY;
    }

    public static void main(String[] args) {
        for (final var e : Flavors.values())
            System.out.println(e.ordinal() + " ");
    }

    /*
    When an enum contains only a list of values,
    the semicolon (;) after the list is optional.
    When an enum contains any other members, such as a constructor or variable,
    then it is required.
    Since the code is missing the semicolon,
    it does not compile, making option C the correct answer.
    There are no other compilation errors in this code.
    If the missing semicolon was added, then the program would print 0 1 2 at runtime.
     */
}

class Question4 {

}
