package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment5;

/**
 * @author jamilxt
 * @created 12 Nov, 2021
 */
class Automobile {
    static StringBuilder engine = new StringBuilder();

    static {
        engine.append("x");
    }

    {
        engine.append("a");
    }

    {
        engine.append("v");
    }

    protected static void clear() {
        engine = new StringBuilder();
    }
//    static StringBuilder engine = new StringBuilder();

}

class Truck extends Automobile {
    {
        engine.append("p");
    }

    static {
        engine.append("r");
    }

    static {
        engine.append("t");
    }

    public static void main(String[] args) {
        var s = new StringBuilder();
        s.append(Automobile.engine.toString());
        Automobile.clear();
        new Truck();
        s.append(" ");
        new Automobile();
        s.append(Automobile.engine.toString());
        System.out.print(s);
    }

    /*
        What is the output of the following program?
        A. x pav
        B. xrt apav
        C. xrt avpav
        D. xrt xrtavpav
        E. The code does not compile.
        F. The code compiles but produces an exception at runtime.

        The Automobile class contains a static variable engine that is used before it is declared,
        which is not allowed.
        For this reason, the code does not compile, and option E is the correct answer.
        If the variable was declared before the static initializer,
        then the code would compile and print xrt avpav at runtime,
        making option C correct.
        Remember that each class is initialized only once,
        with superclasses initialized before subclasses.
        Likewise, instances are initialized from the top down,
        with constructors guiding the order of initialization.
     */
}
