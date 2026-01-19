package Day2;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single alphabet character: ");
        char ch = sc.next().charAt(0); // Read a character

        // Convert to lowercase to handle both cases
        ch = Character.toLowerCase(ch);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                if ((ch >= 'a' && ch <= 'z')) { // Check if it is an alphabet
                    System.out.println(ch + " is a consonant.");
                } else {
                    System.out.println("Invalid input! Not an alphabet.");
                }
        }

        sc.close();
    }
}
