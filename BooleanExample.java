package datatypes;

public class BooleanExample {
    public static void main(String args[]) {
        int ageOfPerson = 50;
        boolean isEligible = true;
        if (ageOfPerson >= 18) {
            if (isEligible) {
                System.out.println("The person is  eligible to vote");
            } else {
                System.out.println("The person is not eligible to vote");
            }
        }
    }
}
