package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author jamilxt
 * @created 08 Nov, 2021
 */
public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<Integer> c1 = (o1, o2) -> o2 - o1;
        Comparator<Integer> c2 = Comparator.naturalOrder();
        Comparator<Integer> c3 = Comparator.reverseOrder();

        var list = Arrays.asList(5, 4, 7, 2);
        Collections.sort(list, c2);
        System.out.println(Collections.binarySearch(list, 2));
    }

    /*
        When using binarySearch(),
        the List must be sorted in the same order that the Comparator uses.
        Since the binarySearch() method does not specify a Comparator explicitly,
        the default sort order is used.
        Only c2 uses that sort order and correctly identifies that the value 2 is at index 0.
        Therefore, option A is correct.
        The other two comparators sort in descending order.
        Therefore, the precondition for binarySearch() is not met,
        and the result is undefined for those two.
 */

    public void whatHappensNext() throws IOException {

    /*
        A method that declares an exception isn’t required to throw one,
        making option A correct.
        Unchecked exceptions can be thrown in any method, making options C and E correct.
        Option D matches the exception type declared, so it’s also correct.
        Option B is incorrect because a broader exception is not allowed.
     */

    }



}


