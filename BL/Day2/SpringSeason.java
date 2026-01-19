package Day2;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter month and day
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int d = sc.nextInt();

        boolean isSpring = false;

        // Check if date is in spring season (March 20 to June 20)
        if (m == 3 && d >= 20 && d <= 31) {          // March 20-31
            isSpring = true;
        } else if (m == 4 || m == 5) {              // April and May
            isSpring = true;
        } else if (m == 6 && d >= 1 && d <= 20) {   // June 1-20
            isSpring = true;
        } else {                                    // Any other date
            isSpring = false;
        }

        // Print the result
        System.out.println("Is it spring? " + isSpring);

        sc.close();
    }
}
