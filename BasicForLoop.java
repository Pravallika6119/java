package com.concent;

public class BasicForLoop {
    public static void main(String args[]) {
        int a, b, c;
        for (a = 10, b = 15, c = 35; a + b <= c; a++) {
            System.out.println("Statement is true");
            break;
        }
    }
}
