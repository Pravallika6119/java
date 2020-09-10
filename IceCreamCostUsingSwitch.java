package arrays;

public class IceCreamCostUsingSwitch {
    public static void main(String args[]) {
        String flavours[] = {"Vanilla", "Chocolate", "Butterscotch", "Blackcurrent"};
        int cost;
        String flavour = "Butterscotch";
        switch (flavour) {
            case "Vanilla":
                System.out.println("I want " + flavour + " icecream ");
                cost = 50;
                if (cost <= 100) {
                    System.out.println("Icecream cost is " + cost);
                }
                break;
            case "Butterscotch":
                System.out.println("I want " + flavour + " icecream ");
                cost = 80;
                if (cost < 100) {
                    System.out.println(" Icecream cost is " + cost);
                }
                break;
            case "Blackcurrent":
                System.out.println("I want " + flavour + " icecream ");
                cost = 100;
                if (cost <= 100) {
                    System.out.println(" Icecream cost is " + cost);
                }
                break;
            default:
                System.out.println("Cost is too high ");
                break;

        }
    }
}

