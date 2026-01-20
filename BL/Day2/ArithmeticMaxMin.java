package Day2;

import java.util.Scanner;

public class ArithmeticMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.print("Enter third number (c): ");
        int c = sc.nextInt();

        // Perform the operations
        int op1 = a + b * c;
        int op2 = c + a / b;
        int op3 = a % b + c;
        int op4 = a * b + c;

        // Display results
        System.out.println("Results of operations:");
        System.out.println("i) a + b * c = " + op1);
        System.out.println("ii) c + a / b = " + op2);
        System.out.println("iii) a % b + c = " + op3);
        System.out.println("iv) a * b + c = " + op4);

        // Find maximum
        int max = op1;
        if (op2 > max) {
            max = op2;
        }
        if (op3 > max) {
            max = op3;
        }
        if (op4 > max) {
            max = op4;
        }

        // Find minimum
        int min = op1;
        if (op2 < min) {
            min = op2;
        }
        if (op3 < min) {
            min = op3;
        }
        if (op4 < min) {
            min = op4;
        }

        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);

        sc.close();
    }
}
