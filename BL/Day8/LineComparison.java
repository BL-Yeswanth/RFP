package Day8;

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Line implements Comparable<Line> {

    Point p1;
    Point p2;

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    double getLength() {
        return Math.sqrt(
                Math.pow(p2.x - p1.x, 2) +
                        Math.pow(p2.y - p1.y, 2)
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        Line other = (Line) obj;
        return Double.compare(this.getLength(), other.getLength()) == 0;
    }

    @Override
    public int compareTo(Line other) {
        return Double.compare(this.getLength(), other.getLength());
    }
}

public class LineComparison {

    public static void main(String[] args) {

        Line line1 = new Line(
                new Point(2, 3),
                new Point(6, 7)
        );

        Line line2 = new Line(
                new Point(1, 4),
                new Point(5, 8)
        );

        // UC2: Equality check
        if (line1.equals(line2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are not equal");
        }

        // UC3 + UC4: Compare lines
        int result = line1.compareTo(line2);

        if (result == 0) {
            System.out.println("Line 1 is equal to Line 2");
        } else if (result > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 1 is less than Line 2");
        }
    }
}
