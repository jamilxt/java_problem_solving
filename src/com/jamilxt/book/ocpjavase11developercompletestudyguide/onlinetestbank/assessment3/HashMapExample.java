package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment3;

import java.util.HashMap;

/**
 * @author jamilxt
 * @created 09 Nov, 2021
 */
public class HashMapExample {
    public static void main(String[] args) {
        var map = new HashMap<Integer, Integer>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);

//        map.merge(1, 3, v -> v);
//        map.merge(3, 3, v -> v);

        System.out.println(map);

        /*
        The merge() function requires a BiFunction as the mapping function.
        This code uses a Function instead, which does not compile.
         */
    }
}
