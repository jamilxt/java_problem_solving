package com.jamilxt.book.ocpjavase11developercompletestudyguide.chapter9.topic2;

/**
 * @author jamilxt
 * @created 05 Nov, 2021
 */

public class ImplementingInterface {

// Implicit Modifiers
// - An implicit modifier is one that compiler will automatically insert.
// The way compiler inserts a default no-arguments constructor if you don't define one.

// List of Implicit Modifiers for interfaces
// - Interfaces are assumed to be "abstract".
// - Interface variables are assumed to be "public", "static", and "final".
// - Interface methods without a body are assumed to be "abstract" and "public".

// That being said, the following two interfaces are equivalent,
// as the compiler will convert them both to the 2nd declaration:

    public interface HumanAbility1 {            // 1st
        int HEIGHT = 10;
        final static boolean FLY = false;
        void run(int speed);
        abstract void jump();
        public abstract double swim();
    }

    public abstract interface HumanAbility2 {   // 2nd
        public static int HEIGHT = 10;
        public final static boolean FLY = false;
        public abstract void run(int speed);
        public abstract void jump();
        public abstract double swim();
    }
// Note: IDE will give you the indication graying them out that,
// those implicit modifiers are redundant as the compiler put them for you by default
}





