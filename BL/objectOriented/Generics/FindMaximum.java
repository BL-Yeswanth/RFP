package objectOriented.Generics;

import java.util.Arrays;

public class FindMaximum<T extends Comparable<T>> {

    private final T[] values;

    /**
     * Parameterized constructor accepting more than three values.
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
     * Instance method to find maximum.
     *
     * @return maximum value
     */
    public T testMaximum() {
        return findMaximum(values);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Find Maximum Problem using Generics");

        // -------- Integer Test Case --------
        FindMaximum<Integer> intTest =
                new FindMaximum<>(10, 40, 30, 20, 50);
        System.out.println("Integer Max: " + intTest.testMaximum());

        // -------- Float Test Case --------
        FindMaximum<Float> floatTest =
                new FindMaximum<>(12.5f, 9.5f, 22.5f, 18.5f);
        System.out.println("Float Max: " + floatTest.testMaximum());

        // -------- String Test Case --------
        FindMaximum<String> stringTest =
                new FindMaximum<>("Apple", "Banana", "Peach", "Mango");
        System.out.println("String Max: " + stringTest.testMaximum());
    }
}
