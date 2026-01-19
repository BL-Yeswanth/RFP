package Day2;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int originalNumber = n; // Store original number
        int reversed = 0;

        // Reverse the number
        while (n != 0) {
            int digit = n % 10;           // Get last digit
            reversed = reversed * 10 + digit; // Append to reversed
            n = n / 10;                   // Remove last digit
        }

        // Check if original number is equal to reversed number
        if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

        sc.close();
    }
}
