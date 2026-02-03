package objectOriented.Generics;

import java.util.Arrays;

/**
 * Generic class to find and print maximum values.
 *
 * @param <T> Generic type extending Comparable
 */
public class FindMaximum<T extends Comparable<T>> {

    private final T[] values;

    /**
     * Parameterized constructor accepting multiple values.
     *
     * @param values variable number of values
     */
    @SafeVarargs
    public FindMaximum(T... values) {
        this.values = values;
    }

    /**
     * Static generic method to find maximum using sorting.
     *
     * @param values variable number of values
     * @param <T>    generic type
     * @return maximum value
     */
    @SafeVarargs
    public static <T extends Comparable<T>> T findMaximum(T... values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }

    /**
     * Generic method to print maximum value.
     *
     * @param max maximum value
     * @param <T> generic type
     */
    public static <T> void printMax(T max) {
        System.out.println("Maximum Value: " + max);
    }

    /**
     * Instance method that finds and prints maximum.
     *
     * @return maximum value
     */
    public T testMaximum() {
        T max = findMaximum(values);
        printMax(max);
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Find Maximum Problem using Generics");

        // -------- Integer Test Case --------
        FindMaximum<Integer> intTest =
                new FindMaximum<>(10, 40, 30, 20, 50);
        intTest.testMaximum();

        // -------- Float Test Case --------
        FindMaximum<Float> floatTest =
                new FindMaximum<>(12.5f, 9.5f, 22.5f, 18.5f);
        floatTest.testMaximum();

        // -------- String Test Case --------
        FindMaximum<String> stringTest =
                new FindMaximum<>("Apple", "Banana", "Peach", "Mango");
        stringTest.testMaximum();
    }
}
