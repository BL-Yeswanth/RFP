package Day2;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coefficients a, b, c
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // Check if a is zero
        if (a == 0) {
            System.out.println("Not a quadratic equation (a cannot be 0).");
        } else {
            // Calculate delta
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("The equation has complex roots.");
            } else {
                // Calculate roots
                double root1 = (-b + Math.sqrt(delta)) / (2 * a);
                double root2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Root 1 = " + root1);
                System.out.println("Root 2 = " + root2);
            }
        }

        sc.close();
    }
}
