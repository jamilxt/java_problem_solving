package com.jamilxt.site.codeforce.tried;

import java.util.Scanner;

public class B_279 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalBooks = scanner.nextInt();
        int totalTime = scanner.nextInt();

        int[] eachBook = new int[totalBooks];

        int finishedReading = 0;

        // input time for each book
        for (int i = 0; i < eachBook.length; i++) {

            eachBook[i] = scanner.nextInt();

        }

        int min = eachBook[0];
        int index = 0;

        // re-arrange each book by time (asc)

/*
        eachBook[0] < eachBook[1]
                swap
            else


*/


        for (int book : eachBook) {
            System.out.println(book + " ");
        }

    }

}
