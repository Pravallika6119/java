package datatypes;

public class TrafficSignalUsingBoolean {
    public static void main(String args[]) {
        int second = 0;
        String[] color = {"Red", "Green", "Orange"};
        boolean clickStop = false;
        boolean clickWait = false;
        boolean clickGo = false;
        if (clickStop) {
            for (second = 0; second < 60; second++) {
                System.out.println("color is:" + color[0]);
                System.out.println("All vehicles will be stop.");
                break;
            }
        } else {
            System.out.println("All vehicles will go.");
        }
        if (clickGo) {
            for (second = 0; second < 60; second++) {
                System.out.println("color is:" + color[1]);
                System.out.println("All vehicles will move.");
                break;
            }
        } else {
            System.out.println("No vehicles will  move.");
        }
        if (clickWait) {
            for (second = 0; second < 60; second++) {
                System.out.println("color:" + color[2]);
                System.out.println("All vehicles will ready to move.");
                break;
            }
        } else {
            System.out.println("No vehicles will ready to stop");
        }
    }
}
