package arrays;

public class StudentGradeUsingArray {
    public static void main(String args[]) {
        int marks[] = {40, 80, 80, 40, 60, 60};
        int i;
        float total = 0, average;
        for (i = 0; i < 6; i++) {
            total = total + marks[i];
        }
        average = total / 6;
        System.out.println("The student grade is : ");
        if (average >= 80) {
            System.out.println("A");
        } else if (average >= 60 && average < 80) {
            System.out.println("B");
        } else if (average >= 40 && average < 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
