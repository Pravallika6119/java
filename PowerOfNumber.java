package com.concent;

public class PowerOfNumber {
    public static void main(String args[]) {
        int base = 12;
        int exponent = 2;
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Result of " + base + " power " + exponent + " is " + result);

    }
}
