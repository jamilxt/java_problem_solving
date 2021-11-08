package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment1;

import java.util.function.*;

/**
 * @author jamilxt
 * @created 08 Nov, 2021
 */
public class Hello<T> {
    T t;

    public Hello(T t) {
        this.t = t;
    }

    public String toString() {
        return t.toString();
    }

    private <T> void println(T message) {
        System.out.println(t + "-" + message);
    }

    public static void main(String[] args) {
        new Hello<String>("hi").println(1);
        new Hello("hola").println(true);
    }

    /*
        The class compiles and runs without issue.
        Line 10 gives a compiler warning for not using generics but not a compiler error.
        Line 4 compiles fine because toString() is defined on the Object class and is therefore always available to call.

        Line 9 creates the Hello class with the generic type String.
        It also passes an int to the println() method, which gets autoboxed into an Integer.
        While the println() method takes a generic parameter of type T,
        it is not the same <T> defined for the class on line 1. Instead,
        it is a different T defined as part of the method declaration on line 5.
        Therefore, the String argument on line 9 applies only to the class.
        The method can actually take any object as a parameter including autoboxed primitives.
        Line 7 creates the Hello class with the generic type Object since no type is specified for that instance.
        It passes a boolean to println(), which gets autoboxed into a Boolean. The result is that hi-1hola-true is printed,
        making option B correct.
    */

    public void isIt(String param1, String param2) {
        String local1 = param1 + param2;
        String local2 = param1 + param2;

        param1 = null;
        local2 = null;
    }

    /*
    Method parameters and local variables are effectively final if they aren’t changed after initialization.
    Options A and D meet this criterion.
     */

    /*
    A class cannot extend any interface,
    as a class can only extend other classes and interfaces can only extend other interfaces,
    making option A correct.
    Java enables only limited multiple inheritance with inheritances,
    making option B incorrect.
    True multiple inheritance would be if a class could extend multiple classes directly.
    Option C is incorrect, as interfaces are implicitly marked abstract.
    Option D is also incorrect,
    as interfaces do not contain constructors and do not participate in object initialization.
    Option E is correct, an interface can extend multiple interfaces.
    Option F is also correct, as abstract types cannot be instantiated.
     */

    // functional interface
    public void doubles(ToDoubleFunction<String> x, LongToDoubleFunction y, Consumer<Double> z) {
        double d1 = x.applyAsDouble("");
        double d2 = y.applyAsDouble(1L);
        z.accept(1.0);
    }

    /*
        ToDoubleFunction<String> x, LongToDoubleFunction y, Consumer<Double> z

        Lines 6 and 7 both call the method applyAsDouble() rather than apply().
        This tells us that the answer is a primitive functional interface,
        ruling out options C and D.
        The primitive versions are correct with options E and F.
        Line 8 calls accept(), making it a consumer.
        Option A is the remaining correct answer.
     */


}


