package arrays;

public class WhileExample1 {
    public static void main(String args[]) {
        String[] temples = {"Tirumala", "Srikalahasthi", "Kanipakam", "KanakaDurga", "Lepakshi"};
        System.out.println("List of famous temples in andhrapradesh:");
        int i = 0;
        while (i < temples.length) {
            System.out.println(temples[i]);
            i++;

        }

    }
}
