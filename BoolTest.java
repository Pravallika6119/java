package datatypes;

public class BoolTest {
    public static void main(String args[]) {
        boolean b;
        b = false;
        System.out.println("b is false");
        b = true;
        System.out.println("b is true");
        if (b == true)
            System.out.println("This is executed ");
        if (b == false)
            System.out.println("This is not executed ");
        System.out.println("10>9 is " + (10 > 9));
    }
}
