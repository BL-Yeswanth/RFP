public class FibonacciComparison {

    // Recursive Fibonacci
    public static int fibonacciRecursive(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacciRecursive(n - 1)
                + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci
    public static int fibonacciIterative(int n) {

        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 2; i <= n; i++) {

            sum = a + b;
            a = b;
            b = sum;
        }

        return b;
    }

    public static void main(String[] args) {

        int n = 40;

        long start1 = System.nanoTime();
        fibonacciRecursive(n);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        fibonacciIterative(n);
        long end2 = System.nanoTime();

        System.out.println("Recursive Time: " + (end1 - start1) + " ns");
        System.out.println("Iterative Time: " + (end2 - start2) + " ns");
    }
}