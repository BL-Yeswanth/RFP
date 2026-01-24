package Day6;

import java.util.Scanner;

public class VendingMachine {

    static int count = 0;
    static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};

    static void findNotes(int amount, int index) {

        // base case
        if (amount == 0) {
            return;
        }

        // if note can be used
        if (amount >= notes[index]) {
            int num = amount / notes[index];
            count += num;

            System.out.println(notes[index] + " x " + num);

            amount = amount % notes[index];
        }

        // recursive call for next smaller note
        findNotes(amount, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        findNotes(amount, 0);

        System.out.println("Minimum number of notes = " + count);
    }
}
