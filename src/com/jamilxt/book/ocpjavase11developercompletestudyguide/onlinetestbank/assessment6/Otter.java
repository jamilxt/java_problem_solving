package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment6;

/**
 * @author jamilxt
 * @created 15 Nov, 2021
 */
class Question3 {
}

class Toy {
    private boolean containsIce = false;

    public boolean containsIce() {
        return containsIce;
    }

    public void removeIce() {
        this.containsIce = true;
    }
}

public class Otter {
    private static void play(Toy toy) {
        toy = new Toy();
        toy.removeIce();
    }

    public static void main(String[] args) {
        Toy toy = new Toy();
        Otter.play(toy);
        System.out.println(toy.containsIce());
    }
    /*
        Since Java is pass by value,
        reassignments to method parameters are not seen by the caller.
        The play() method assigns the method parameter a new Toy object.
        While that new object is available inside the play() method,
        the main() method does not see it.
     */
}
