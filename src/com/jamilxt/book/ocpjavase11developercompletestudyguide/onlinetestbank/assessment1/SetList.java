package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author jamilxt
 * @created 08 Nov, 2021
 */
public class SetList {
    public static void main(String[] args) {
        Set<String> set = Set.of("mickey", "minnie");
        List<String> list = new ArrayList<>(set);

        set.forEach(s -> System.out.println(s));
        list.forEach(s -> System.out.println(s));
    }
}
