package datatypes;

public class ShoppingMall {
    public static void main(String args[]) {
        boolean found = true;
        int floor;
        int selectedFloor = 2;
        String mallName = "Subhamasthu";
        if (mallName.equals("Subhamasthu")) {
            System.out.println("Mall is opened ");
            if (found) {
                for (floor = 3; floor <= 3; floor++) {
                    if (floor == 0) {
                        System.out.println("Sarees are available in ground floor " + floor);
                    } else if (floor == 1) {
                        System.out.println("Kids dresses are available in first foor " + floor);
                    } else if (floor == 2) {
                        System.out.println("Mens wears are available in second floor  " + floor);
                    } else if (floor == 3) {
                        System.out.println("Readymates are available in third floor " + floor);
                    }
                }

            }
        } else {
            System.out.println("Mall is closed ");
        }
    }
}
