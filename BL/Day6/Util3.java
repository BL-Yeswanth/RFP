package Day6;

public class Util3 {

    // static function to compute square root
    public static double sqrt(double c) {

        if (c < 0) {
            return -1;   // invalid input
        }

        double epsilon = 1e-15;
        double t = c;

        while (Math.abs(t - c / t) > epsilon * t) {
            t = (t + c / t) / 2;
        }

        return t;
    }

    public static void main(String[] args) {

        double c = Double.parseDouble(args[0]);

        double result = sqrt(c);

        System.out.println("Square root = " + result);
    }
}
