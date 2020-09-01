package com.concent;

public class SwapIntegers {
    public static void main(String args[]) {
        int m = 5;
        int n = 7;
        int temp;
        temp = m;
        m = n;
        n = temp;
        System.out.println("After Swapping");
        System.out.println("First number:" + m);
        System.out.println("Second number:" + n);
    }
}
