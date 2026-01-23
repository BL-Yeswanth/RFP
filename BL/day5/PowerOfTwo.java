package day5;

public class PowerOfTwo {

    public static void main(String[] args) {

        // Take input from command line
        int N = Integer.parseInt(args[1]);

        // Check valid range
        if (N < 0 || N >= 31) {
            System.out.println("Please enter N such that 0 <= N < 31");
            return;
        }

        int power = 1; // 2^0 = 1

        // Repeat until i equals N
        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + power);
            power = power * 2;
        }
    }
}

