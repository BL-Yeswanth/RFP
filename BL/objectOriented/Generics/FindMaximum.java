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

        // UC1 - TC1.1
        // Max number at 1st position
        Integer result = findMaximum(30, 20, 10);

        System.out.println("TC1.1 Result: " + result);
    }
}
