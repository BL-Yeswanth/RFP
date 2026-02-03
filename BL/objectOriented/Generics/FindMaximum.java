package objectOriented.Generics;

public class FindMaximum<T extends Comparable<T>> {

    private final T a;
    private final T b;
    private final T c;

    /**
     * Parameterized constructor
     *
     * @param a first value
     * @param b second value
     * @param c third value
     */
    public FindMaximum(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Static generic method to find maximum
     */
    public static <T extends Comparable<T>> T findMaximum(T a, T b, T c) {

        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    /**
     * Instance method that internally calls static method
     *
     * @return maximum value
     */
    public T testMaximum() {
        return findMaximum(a, b, c);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Find Maximum Problem using Generics");

        // ----------- Integer Test Cases using Generic Class -----------
        System.out.println("\nInteger Test Cases");
        FindMaximum<Integer> intTest1 = new FindMaximum<>(30, 20, 10);
        System.out.println("Max (30, 20, 10): " + intTest1.testMaximum());

        FindMaximum<Integer> intTest2 = new FindMaximum<>(10, 30, 20);
        System.out.println("Max (10, 30, 20): " + intTest2.testMaximum());

        FindMaximum<Integer> intTest3 = new FindMaximum<>(10, 20, 30);
        System.out.println("Max (10, 20, 30): " + intTest3.testMaximum());

        // ----------- Float Test Cases using Generic Class -----------
        System.out.println("\nFloat Test Cases");
        FindMaximum<Float> floatTest =
                new FindMaximum<>(10.5f, 20.5f, 30.5f);
        System.out.println("Max (10.5, 20.5, 30.5): " + floatTest.testMaximum());

        // ----------- String Test Cases using Generic Class -----------
        System.out.println("\nString Test Cases");
        FindMaximum<String> stringTest =
                new FindMaximum<>("Apple", "Peach", "Banana");
        System.out.println("Max (Apple, Peach, Banana): " + stringTest.testMaximum());
    }
}
