package com.jamilxt.book.modernjavarecipes.chapter1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jamilxt
 * @created 07 Nov, 2021
 */
public class StaticMethodsInInterface {

    /*
    * Key points to remember:
    * - Static methods must have an implementation
    * - You can not override a static method
    * - Call static methods from the interface name
    * - You do not need to implement an interface to use its static method
    * */

    public static void main(String[] args) {
        List<String> animals = Arrays.asList("Lion", "Horse", "Cow", "Bear");

        // Natural Order
        List<String> sorted = animals.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(sorted);                       // [Bear, Cow, Horse, Lion]

        // Reverse Lexicographical
        sorted = animals.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sorted);                       // [Lion, Horse, Cow, Bear]

        // Sort by lowercase name
        sorted = animals.stream()
                .sorted(Comparator.comparing(String::toLowerCase))
                .collect(Collectors.toList());
        System.out.println(sorted);                       // [Bear, Cow, Horse, Lion]

        // Sort by name length
        sorted = animals.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(sorted);                       // [Cow, Lion, Bear, Horse]

        // Sort by length, the equal lengths lexicographically
        sorted = animals.stream()
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());
        System.out.println(sorted);                       // [Cow, Bear, Lion, Horse]
    }
}
