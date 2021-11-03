package com.jamilxt.site.codeforce.solved;

import java.util.Scanner;

public class A_118 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a'
                    || s.charAt(i) == 'e'
                    || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u'
                    || s.charAt(i) == 'y'
                    || s.charAt(i) == 'A'
                    || s.charAt(i) == 'E'
                    || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U'
                    || s.charAt(i) == 'Y'
                    ) {

                continue;

            } else {

                System.out.print(".");

                int c = (int) s.charAt(i);

                if (c >= 65 && c <= 90) {

                    c = c + 32;

                    System.out.print((char) c);

                } else {

                    System.out.print(s.charAt(i));
                }
            }
        }
    }

}
