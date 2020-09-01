package com.concent;

public class Age {
    public static void main(String args[]) {
        int age = 45;
        if (age < 60 && age > 50) {
            System.out.println("Age of Venugopal");
        } else if (age < 70 && age >= 45) {
            System.out.println("Age of Padmavathi");
        } else if (age < 20 && age > 15) {
            System.out.println("Age of Damini");
        } else {
            System.out.println("Age is not between 1 to 10");
        }
    }
}
