package objectOriented.Generics;

public class FindMaximum {

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
        System.out.println("TC1.1 (Max at 1st Position): "
                + findMaximum(30, 20, 10));

        // UC1 - TC1.2
        // Max number at 2nd position
        System.out.println("TC1.2 (Max at 2nd Position): "
                + findMaximum(10, 30, 20));

        // UC1 - TC1.3
        // Max number at 3rd position
        System.out.println("TC1.3 (Max at 3rd Position): "
                + findMaximum(10, 20, 30));
    }
}
