package com.concent;

public class AndhraPradeshFamousTemples {
    public static void main(String args[]) {
        int selectFamousTemple = 2;
        String[] temples = {"Tirumala", "Srikalahasthi", "Kanipakam", "KanakaDurga", "Lepakshi"};
        System.out.println("Total no of famous temples " + temples.length);
        System.out.println("List of famous temples in andhrapradesh:");
        for (int temple = 0; temple < temples.length; temple++) {  
            System.out.println(temples[temple]);

        }
        System.out.println("Select one temple: " + temples[selectFamousTemple]);
    }
}