package Day8;

public class LineComparison {

    public static void main(String[] args) {

        // Line 1 coordinates
        double x1 = 2;
        double y1 = 3;
        double x2 = 6;
        double y2 = 7;

        Double length1 = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        // Line 2 coordinates
        double x3 = 1;
        double y3 = 4;
        double x4 = 5;
        double y4 = 8;

        Double length2 = Math.sqrt(
                Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2)
        );

        if (length1.equals(length2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are not equal");
        }
    }
}
