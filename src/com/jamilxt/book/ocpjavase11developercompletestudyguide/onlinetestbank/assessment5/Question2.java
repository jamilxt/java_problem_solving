package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment5;

import java.util.List;

/**
 * @author jamilxt
 * @created 12 Nov, 2021
 */
public class Question2 {
    public void remove(List<Character> chars) {
        char end = 'z';
//        chars = null;
        chars.removeIf(c -> {
            char start = 'a';
            return start <= c && c <= end;
        });
    }

    /*
    Which of the following can be inserted without causing a compilation error? (Choose all that apply.)
    A. char start = 'a';
    B. char c = 'x';
    C. chars = null; // it does compile but throws an exception and runtime
    D. end = '1'; // Variable used in lambda expression should be final or effectively
    E. None of the above

    Lambdas are not allowed to redeclare local variables,
    making options A and B incorrect.
    Option D is incorrect because setting end prevents it from being effectively final.
    Lambdas are only allowed to reference effectively final variables.
    Option C is tricky because it does compile but throws an exception and runtime.
    Since the question only asks about compilation, option C is correct.
     */
}
