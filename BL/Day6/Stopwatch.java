package Day6;

import java.util.Scanner;

public class Stopwatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Press ENTER to start the stopwatch");
        sc.nextLine();   // wait for start

        long startTime = System.currentTimeMillis();

        System.out.println("Press ENTER to stop the stopwatch");
        sc.nextLine();   // wait for stop

        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time = " + elapsedTime + " milliseconds");
    }
}
