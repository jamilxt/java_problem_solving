package com.jamilxt.site.codeforce.tried;

import java.util.Scanner;

public class A_599 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();

        int d3 = scanner.nextInt();

        if (d1 < d3) {

            // goto d1

            int d1_d2_go = d1 + d2; // goto distance

            if ((d1_d2_go * 2) < (d1_d2_go + d3)) {
                // return distance
                // print minimal distance
                System.out.println(d1_d2_go * 2);

            } else {
                // choose d3 to return
                System.out.println(d1_d2_go + d3);
            }

        } else {

            // goto d3

            if (d3 < d2) {
                // return to home -> go shop 1 -> return home
                System.out.println((d3 * 2) + (d1 * 2));

            } else {

                // go to shop 2 -> compare -> return home

                int d3_d2_go = d3 + d2;

                if ((d3_d2_go * 2) < (d3_d2_go + d1)) {
                    // choose reverse path
                    System.out.println(d3_d2_go * 2);

                } else {
                    // choose d1 path
                    System.out.println(d3_d2_go + d1);
                }

            }

        }




    }

}
