package Day8;

public class LineComparison {

    public static void main(String[] args) {

        double x1 = 2;
        double y1 = 3;
        double x2 = 6;
        double y2 = 7;

        double length = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        System.out.println("Length of the line = " + length);
    }
}
