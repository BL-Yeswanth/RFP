package objectOriented.Generics;

public class FindMaximum {

    /**
     * UC1: Finds the maximum of three Integer values using compareTo().
     */
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

    /**
     * UC2: Finds the maximum of three Float values using compareTo().
     */
    public static Float findMaximum(Float a, Float b, Float c) {

        Float max = a;

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

        // TC2.1: Max at 1st position
        System.out.println("TC2.1 (Max at 1st Position): "
                + findMaximum(30.5f, 20.2f, 10.1f));

        // TC2.2: Max at 2nd position
        System.out.println("TC2.2 (Max at 2nd Position): "
                + findMaximum(10.1f, 30.5f, 20.2f));

        // TC2.3: Max at 3rd position
        System.out.println("TC2.3 (Max at 3rd Position): "
                + findMaximum(10.1f, 20.2f, 30.5f));
    }
}
