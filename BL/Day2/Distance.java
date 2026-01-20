package Day2;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x-coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y-coordinate: ");
        int y = sc.nextInt();

        // Calculate distance using Math.pow
        double distance = Math.sqrt(x * x + y * y);

        System.out.println("Euclidean distance from (" + x + ", " + y + ") to origin = " + distance);

        sc.close();
    }
}


