package com.jamilxt.site.codeforce.solved;

import java.util.Scanner;

public class A_96 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        while (scanner.hasNext()) {

            String s = scanner.next();

            int strLength = s.length();

            int zero = 0;
            int one = 0;

            // 001001
            for (int i = 0; i < strLength; i++) {

                char prev = s.charAt(i);

                if (s.charAt(i) == '0') {
                    zero++;
                    if (s.charAt(i) == prev) {
                        one = 0;
                    }

                    if (zero >= 7) {
                       strLength = i;
                    }

                } else if (s.charAt(i) == '1') {
                    one++;
                    if (s.charAt(i) == prev) {
                        zero = 0;
                    }

                    if (one >= 7) {
                        strLength = i;
                    }

                }


            }

            if (zero >= 7 || one >= 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            // 000000000100000000000110101100000

//        System.out.println("zero: " + zero);
//        System.out.println("one: " + one);

// 1000000001


//        }


    }

}
