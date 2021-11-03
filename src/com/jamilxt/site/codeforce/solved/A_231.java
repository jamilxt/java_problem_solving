package com.jamilxt.site.codeforce.solved;

import java.util.Scanner;

public class A_231 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalProblems = scanner.nextInt();
        int totalPersons = 3;

        int[][] problem = new int[totalProblems][totalPersons]; // [totalProblem][totalPerson]

        for (int i = 0; i < totalProblems; i++) {

            for (int j = 0; j < totalPersons; j++) {

                problem[i][j] = scanner.nextInt();

            }

        }

        int willSolve = 0;

        for (int _problem = 0; _problem < totalProblems; _problem++) {

            int total = 0;

            for (int _person = 0; _person < totalPersons; _person++) {

                total += problem[_problem][_person];

            }

            if (total > 1) {
                willSolve++;
            }

        }

        System.out.println(willSolve);


    }

}
