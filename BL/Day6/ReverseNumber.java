package Day6;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        while (num != 0) {
            int remainder = num % 10;      // step a
            reverse = reverse * 10 + remainder; // step b
            num = num / 10;                // step c
        }

        System.out.println("Reversed number: " + reverse);
    }
}
