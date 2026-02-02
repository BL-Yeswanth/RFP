package objectOriented.Generics;

public class FindMaximum {

    // Method to find maximum of three Integers using compareTo
    public static Integer findMaximum(Integer a, Integer b, Integer c) {

        Integer max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Find Maximum Problem using Generics");

        // Test Case 1: Maximum at 1st position
        System.out.println("Test Case 1 (Max at 1st): "
                + findMaximum(30, 20, 10));

        // Test Case 2: Maximum at 2nd position
        System.out.println("Test Case 2 (Max at 2nd): "
                + findMaximum(10, 30, 20));

        // Test Case 3: Maximum at 3rd position
        System.out.println("Test Case 3 (Max at 3rd): "
                + findMaximum(10, 20, 30));
    }
}
