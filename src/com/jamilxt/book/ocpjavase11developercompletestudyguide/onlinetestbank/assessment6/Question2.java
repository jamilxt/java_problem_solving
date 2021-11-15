package com.jamilxt.book.ocpjavase11developercompletestudyguide.onlinetestbank.assessment6;

/**
 * @author jamilxt
 * @created 15 Nov, 2021
 */
public class Question2 {
    public static void main(String[] args) {
        int height = 1;
        while (height++ < 10) {
            long humidity = 12;
            do {
                if (humidity-- % 12 == 0) break;
                int temperature = 30;
                for (; ; ) {
                    temperature++;
                    if (temperature > 50) continue;
                }
            } while (humidity > 4);
        }
    }
}
