package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment1;

/**
 * @author jamilxt
 * @created 08 Nov, 2021
 */
public class Cub {
    private String name;
    private double weight;

    public Cub(double weight) {
        this.weight = weight;
//        this("", weight);
    }

    public Cub(String name, double weight) {
        weight = weight;
        this.name = name;
    }

    public static void main(String[] args) {
        Cub cub = new Cub(44);
        System.out.println(cub.weight + "" + cub.name);
    }
}

/*
    The this() call must be the first line of a constructor if present.
    If the order of the statements in the one parameter constructor were reversed,
    the answer would be option E.
 */

