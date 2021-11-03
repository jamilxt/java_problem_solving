package com.jamilxt.site.codeforce.solved;

import java.util.Scanner;

public class A_282 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = 0;

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            String cmd = scanner.next();

            if (cmd.equals("X++")) {
                x++;
            } else if (cmd.equals("++X")) {
                ++x;
            } else if (cmd.equals("--X")) {
                --x;
            } else if (cmd.equals("X--")) {
                x--;
            }

        }

        System.out.println(x);


    }
}
