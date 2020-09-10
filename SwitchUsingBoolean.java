package arrays;

public class SwitchUsingBoolean {
    public static void main(String[] arg) {
        char ch = 'a';
        boolean isVowel = false;
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isVowel = true;
        }
        if (isVowel == true) {
            System.out.println(ch + " is  a Vowel");
        } else
            System.out.println(ch + " is a Consonant");
    }
}
