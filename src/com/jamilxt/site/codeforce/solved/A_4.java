package com.jamilxt.site.codeforce.solved;

import java.util.Scanner;

public class A_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();

        if (w >= 1 && w <= 100) {

            if (w != 2) {

                if (w % 2 == 0) {

                    System.out.println("YES");

                } else {

                    System.out.println("NO");

                }


            } else {
                System.out.println("NO");
            }


        }

    }

}
