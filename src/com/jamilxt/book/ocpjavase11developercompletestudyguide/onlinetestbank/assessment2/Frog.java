package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment2;

/**
 * @author jamilxt
 * @created 09 Nov, 2021
 */

interface CanHop {

}

public class Frog implements CanHop {
    public static void main(String[] args) {
        Frog frog = new TurtleFrog();
        TurtleFrog turtleFrog = new TurtleFrog();
        Object frogObject = new TurtleFrog();
        CanHop frogThatCanHop = new TurtleFrog();
    }
}

class BrazilianHornedFrog extends Frog {
}

class TurtleFrog extends Frog {
}
