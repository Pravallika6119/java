package arrays;

public class IceCreamCostUsingArray {
    public static void main(String args[]) {
        String flavours[] = {"Vanilla", "Chocolate", "Butterscotch", "BlackCurrent"};
        int cost;
        String flavour = "Vanilla";
        for (int i = 0; i < flavours.length; i++) {
            if (flavour.equals("Vanilla")) {
                System.out.println("I want " + flavour + " IceCream ");
                cost = 50;
                if (cost <= 100) {
                    System.out.println("IceCream cost is " + cost);
                    break;
                }
            } else if (flavour.equals("Butterscotch")) {
                System.out.println("I want " + flavour + " IceCream ");
                cost = 80;
                if (cost < 100) {
                    System.out.println(" IceCream cost is " + cost);
                    break;
                }
            } else if (flavour.equals("BlackCurrent")) {
                System.out.println("I want " + flavour + " IceCream ");
                cost = 100;
                if (cost <= 100) {
                    System.out.println(" IceCream cost is " + cost);
                    break;
                }
            } else {
                System.out.println("This flavour is not available");
                break;
            }
        }
    }
}



