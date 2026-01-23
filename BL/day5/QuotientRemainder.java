package day5;

import java.util.Scanner;

public class QuotientRemainder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        // Check division by zero
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed");
            return;
        }

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Output
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}

