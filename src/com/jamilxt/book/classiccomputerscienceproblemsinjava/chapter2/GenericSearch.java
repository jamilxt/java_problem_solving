package com.jamilxt.book.classiccomputerscienceproblemsinjava.chapter2;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author jamilxt
 * @created 15 Nov, 2021
 */
public class GenericSearch {
    public static <T extends Comparable<T>> boolean linearContains(List<T> list, T key) {
        for (T item : list) {
            if (item.compareTo(key) == 0) {
                return true;                // found a match
            }
        }
        return false;
    }

    // assumes *list* is already sorted
    public static <T extends Comparable<T>> boolean binaryContains(List<T> list, T key) {
        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {               // while there is still a search space
            int middle = (low + high) / 2;
            int comparison = list.get(middle).compareTo(key);
            if (comparison < 0) {           // middle is less than (<) key
                low = middle + 1;
            } else if (comparison > 0) {    // middle is greater than (>) key
                high = middle - 1;
            } else {                        // middle is equal to (=) key
                return true;
            }
        }
        return false;
    }

//    public static class Node<T> implements Comparable<Node<T>> {
//        final T state;
//        Node<T> parent;
//        double cost;
//        double heuristic;
//
//        // for dsf and bfs we won't use cost and heuristic
//        public Node(T state, Node<T> parent) {
//            this.state = state;
//            this.parent = parent;
//        }
//
//        // for A* (a star) we will use cost and heuristic
//
//    }

    public static void main(String[] args) {
        System.out.println(linearContains(List.of(1, 5, 15, 15, 15, 15, 20), 5));                   // true
        System.out.println(binaryContains(List.of("a", "d", "e", "f", "z"), "f"));                  // true
        System.out.println(binaryContains(List.of("john", "mark", "ronald", "sarah"), "sheila"));   // false
    }
}
