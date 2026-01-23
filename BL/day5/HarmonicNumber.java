package day5;

public class HarmonicNumber {

    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);

        // Check N is not zero
        if (N == 0) {
            System.out.println("N should not be zero");
            return;
        }

        double sum = 0.0;

        // Compute harmonic value
        for (int i = 1; i <= N; i++) {
            sum = sum + (1.0 / i);
        }

        // Output
        System.out.println("Harmonic value = " + sum);
    }
}
