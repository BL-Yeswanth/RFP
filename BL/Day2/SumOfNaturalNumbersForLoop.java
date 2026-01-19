package Day2;

import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int sum = 0;

        // Use for loop to calculate sum and print numbers
        for (int i = 1; i <= N; i++) {
            sum += i;
            System.out.print(i);
            if (i < N) {
                System.out.print("+"); // Print '+' between numbers
            }
        }

        System.out.println(" = " + sum);

        sc.close();
    }
}
