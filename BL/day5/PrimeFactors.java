package day5;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        // Check valid input
        if (N <= 1) {
            System.out.println("Enter a number greater than 1");
            return;
        }

        // Find prime factors
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N = N / i;
            }
        }

        // If remaining N is greater than 1
        if (N > 1) {
            System.out.println(N);
        }
    }
}

