package com.concent;

public class EvenNumbers {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Even Numbers from 1 to 10");
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "");
            }

        }
    }
}
