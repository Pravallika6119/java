package com.concent;

public class FanSpeed {
    public static void main(String args[]) {
        int speed = 1;
        boolean fanOn = true;
        if (fanOn) {
            if (speed == 3) {
                for (int i = 3; i <= 3; i++) {
                    System.out.println("Fan is on the fast = " + speed);
                }
            } else if (speed == 2) {
                for (int i = 2; i < 3; i++) {
                    System.out.println("Fan is on the medium  = " + speed);
                }
            } else if (speed == 1) {
                for (int i = 1; i < 2; i++) {
                    System.out.println("Fan is on the slow  = " + speed);
                }
            } else {
                System.out.println("Fan is off");
            }
        }
    }
}
