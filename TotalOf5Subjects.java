package com.concent;

public class TotalOf5Subjects {
    public static void main(String args[]) {
        int totalSubjects = 6;
        int eng = 80;
        int chem = 75;
        int telugu = 95;
        int maths = 100;
        int phy = 85;
        int hindhi = 90;
        float marks, percentage, average, total = 0;
        for (int i = 0; i < 6; i++) {
            total = eng + telugu + maths + chem + phy;
        }
        average = total / totalSubjects;
        percentage = (total / (totalSubjects * 100)) * 100;
        System.out.println("Total marks = " + total);
        System.out.println("Average marks = " + average);
        System.out.println(" Marks percentage = " + percentage);

    }
}
