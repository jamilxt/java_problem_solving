package com.jamilxt.site.leetcode.solved;

/**
 * @author jamilxt
 * @created 15 March, 2023
 */
public class PalindromeNumberChecker {
    public static void main(String[] args) {
        int num = 121;
        boolean palindrome = PalindromeNumberChecker.isPalindrome(num);
        System.out.println(palindrome); // true
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = PalindromeNumberChecker.reverseNumber(number);
        return number == reversedNumber;
    }

    public static int reverseNumber(int number) { // Mathematical Approach
        int reversedNumber = 0;
        int remaining = 0;

        while (number > 0) {
            reversedNumber *= 10;
            remaining = number % 10;
            number = (number - remaining) / 10;
            reversedNumber += remaining;
        }
        return reversedNumber;
    }
}
