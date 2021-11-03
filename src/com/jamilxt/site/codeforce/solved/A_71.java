package com.jamilxt.site.codeforce.solved;

import java.util.Scanner;

public class A_71 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            String s = scanner.next();

//        int strlen = s.length();

            if (s.length() > 10) {

                char firstChar = s.charAt(0);
                char lastChar = s.charAt(s.length() - 1);
                int midword = s.length() - 2;

                System.out.println(firstChar + "" + midword + "" + lastChar);

            } else {

                System.out.println(s);

            }

        }


    }

}
