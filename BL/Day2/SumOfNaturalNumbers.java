package Day2;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int sum = 0;
        int i = 1; // Initialize the counter

        // Use while loop to calculate sum and print numbers
        while (i <= N) {
            sum += i;
            System.out.print(i);
            if (i < N) {
                System.out.print("+");
            }
            i++; // Increment the counter
        }

        System.out.println(" = " + sum);

        sc.close();
    }
}
