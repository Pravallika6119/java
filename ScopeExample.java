package datatypes;

public class ScopeExample {
    public static void main(String args[]) {
        int x = 10;
        if (x == 10) { //start new scope
            //known only to this block
            int y = 20;
            // x and y value both known here
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        System.out.println("x is " + x);
    }
}
