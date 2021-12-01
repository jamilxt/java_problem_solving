package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author jamilxt
 * @created 26 Nov, 2021
 */
public class Question1 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 5, 10, 11, 22, 33);
        var f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(localDateTime.format(f));
    }
}
