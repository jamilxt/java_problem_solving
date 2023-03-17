package com.jamilxt.site.leetcode.tried;

public class RomanToIntegerConverter {
    public static void main(String[] args) {
        String roman = "MCMXCIV";
        System.out.println(RomanToIntegerConverter.convertRomanToInteger(roman));
    }

    private static int convertRomanToInteger(String roman) {
        char[] chars = roman.toCharArray();
        int integer = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            char romanChar = chars[i];
            integer += RomanToIntegerConverter.getInteger(romanChar);
        }
        return integer;
    }

    private static int getInteger(char romanChar) {
        return switch (romanChar) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
