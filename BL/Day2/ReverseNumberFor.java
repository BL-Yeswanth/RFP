package Day2;

import java.util.Scanner;

public class ReverseNumberFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int reversed = 0;

        // Reverse the number using a loop
        for (; n != 0; n /= 10) { // loop until n becomes 0
            int digit = n % 10;       // extract the last digit
            reversed = reversed * 10 + digit; // append it to reversed
        }

        System.out.println("Reversed number is: " + reversed);

        sc.close();
    }
}
