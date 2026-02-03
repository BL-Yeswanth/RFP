package objectOriented.Generics;

public class FindMaximum {

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

    public static void main(String[] args) {

        System.out.println("Welcome to Find Maximum Problem using Generics");

        // ---------------- UC1 : Integer Test Cases ----------------
        System.out.println("\nUC1 - Integer Test Cases");
        System.out.println("TC1.1 (Max at 1st Position): "
                + findMaximum(30, 20, 10));
        System.out.println("TC1.2 (Max at 2nd Position): "
                + findMaximum(10, 30, 20));
        System.out.println("TC1.3 (Max at 3rd Position): "
                + findMaximum(10, 20, 30));

        // ---------------- UC2 : Float Test Cases ----------------
        System.out.println("\nUC2 - Float Test Cases");
        System.out.println("TC2.1 (Max at 1st Position): "
                + findMaximum(30.5f, 20.2f, 10.1f));
        System.out.println("TC2.2 (Max at 2nd Position): "
                + findMaximum(10.1f, 30.5f, 20.2f));
        System.out.println("TC2.3 (Max at 3rd Position): "
                + findMaximum(10.1f, 20.2f, 30.5f));

        // ---------------- UC3 : String Test Cases ----------------
        System.out.println("\nUC3 - String Test Cases");
        System.out.println("TC3.1 (Max at 1st Position): "
                + findMaximum("Peach", "Apple", "Banana"));
        System.out.println("TC3.2 (Max at 2nd Position): "
                + findMaximum("Apple", "Peach", "Banana"));
        System.out.println("TC3.3 (Max at 3rd Position): "
                + findMaximum("Apple", "Banana", "Peach"));
    }
}
